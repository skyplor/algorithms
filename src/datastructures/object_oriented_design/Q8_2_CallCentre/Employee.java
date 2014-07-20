package datastructures.object_oriented_design.Q8_2_CallCentre;

public class Employee {
    private String name;
    private boolean free = false;
    private Call currentCall;

    public enum Type {
	Respondent(0), Manager(1), Director(2);

	int value;

	private Type(int value) {
	    this.value = value;
	}
	
	public int getValue() {
	    return value;
	}

    }
    
    private Type emType;

    /**
     * @return the free
     */
    public boolean isFree() {
	return free;
    }

    /**
     * @param free
     *            the free to set
     */
    public void setFree(boolean free) {
	this.free = free;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @return the currentCall
     */
    public Call getCurrentCall() {
	return currentCall;
    }

    /**
     * @param currentCall
     *            the currentCall to set
     */
    public void setCurrentCall(Call currentCall) {
	this.currentCall = currentCall;
    }

    /**
     * @return the emType
     */
    public Type getEmType() {
	return emType;
    }

    /**
     * @param emType the emType to set
     */
    public void setEmType(Type emType) {
	this.emType = emType;
    }

}
