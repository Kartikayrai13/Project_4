package in.co.rays.Project_4.Bean;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * * Parent class of all Beans in application. It contains generic attributes.
 * 
 * @author Kartikay Rai
 *
 */
public abstract class BaseBean implements Serializable, DropdownListBean, Comparable<BaseBean> {
	protected long id;
	protected String createdBy;
	protected String modifiedBy;
	protected Timestamp createdDateTime;
	protected Timestamp modifiedDateTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}
	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}
	public int compareTo(BaseBean next) {
		return getValue().compareTo(next.getValue());
	}
	
}
