package tw.ispan.model;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;

@Component("house")
public class House {

	private int houseid;
	private String housename;

	public House() {
	}

	public House(int houseid, String housename) {
		this.houseid = houseid;
		this.housename = housename;
	}

	public int getHouseid() {
		return houseid;
	}

	public void setHouseid(int houseid) {
		this.houseid = houseid;
	}

	public String getHousename() {
		return housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
	}

}
