package org;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Description("descr")
public class d323 implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("sd")
	private java.lang.Float ds;
	@org.kie.api.definition.type.Label("sf")
	private char sd;
	@org.kie.api.definition.type.Label("ff")
	private int sdff;

	public d323() {
	}

	public java.lang.Float getDs() {
		return this.ds;
	}

	public void setDs(java.lang.Float ds) {
		this.ds = ds;
	}

	public char getSd() {
		return this.sd;
	}

	public void setSd(char sd) {
		this.sd = sd;
	}

	public int getSdff() {
		return this.sdff;
	}

	public void setSdff(int sdff) {
		this.sdff = sdff;
	}

	public d323(java.lang.Float ds, char sd, int sdff) {
		this.ds = ds;
		this.sd = sd;
		this.sdff = sdff;
	}

}