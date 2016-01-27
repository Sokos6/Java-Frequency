package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class StateFileDAO implements StateDAO {
	private static final String FILE_NAME="/WEB-INF/states.csv";
	private List<State> states = new ArrayList<>();
	/*
	 * Use Autowired to have Spring inject an instance
	 * of an ApplicationContext into this object after
	 * creation.  We will use the ApplicationContext to
	 * retrieve an InputStream so we can read from a 
	 * file.
	 */
	@Autowired 
	private ApplicationContext ac;

	/*
	 * The @PostConstruct method is called by Spring after 
	 * object creation and dependency injection
	 */
	@PostConstruct
	public void init() {
		// Retrieve an input stream from the application context
		// rather than directly from the file system
		try (
				InputStream is = ac.getResource(FILE_NAME).getInputStream();
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			) {
			String line = buf.readLine();
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				String abbrev = tokens[1];
				String name = tokens[2];
				String capital = tokens[3];
				String latitude = tokens[4];
				String longitude = tokens[5];
				String population = tokens[6];
				String factLink = tokens[7];
				states.add(new State(abbrev, name, capital, latitude, longitude, population, factLink));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public State getStateByName(String name) {
		State s = null;
		for (State state : states) {
			if (state.getName().equalsIgnoreCase(name)) {
				s = state;
				break;
			}
		}
		return s;
	}
	@Override
	public State getStateByAbbreviation(String abbrev) {
		State s = null;
		for (State state : states) {
			if (state.getAbbreviation().equalsIgnoreCase(abbrev)) {
				s = state;
				break;
			}
		}
		return s;
	}
	@Override
	public void addState(State state) {
		states.add(state);
	}
}

