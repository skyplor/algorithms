package datastructures.object_oriented_design.Q8_2_CallCentre;

public class Call {

    Caller caller;

    public enum ProblemLevel {
	Respondent(0), Manager(1), Director(2);

	int value;

	private ProblemLevel(int value) {
	    this.value = value;
	}

	public int getValue() {
	    return value;
	}

	public ProblemLevel getLevelFromValue(int value) {
	    switch (value) {
	    case 0:
		return Respondent;
	    case 1:
		return Manager;
	    case 2:
		return Director;
	    default:
		return null;
	    }
	}
    }

    private ProblemLevel problemLevel;

    public Call(String cName, ProblemLevel problemLevel) {
	caller = new Caller();
	caller.setName(cName);
	this.problemLevel = problemLevel;
    }

    /**
     * @return the level
     */
    public ProblemLevel getProblemLevel() {
	return problemLevel;
    }

    /**
     * @param level
     *            the level to set
     */
    public void setProblemLevel(ProblemLevel problemLevel) {
	this.problemLevel = problemLevel;
    }

}
