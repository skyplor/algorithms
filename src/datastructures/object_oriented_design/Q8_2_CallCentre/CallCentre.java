package datastructures.object_oriented_design.Q8_2_CallCentre;

import datastructures.implementations.MyQueueImpl;

public class CallCentre {
    MyQueueImpl<Employee> directorQueue;
    MyQueueImpl<Employee> managerQueue;
    MyQueueImpl<Employee> respondentQueue;
    MyQueueImpl<Call> callQueue;

    public CallCentre() {
	directorQueue = new MyQueueImpl<Employee>();
	managerQueue = new MyQueueImpl<Employee>();
	respondentQueue = new MyQueueImpl<Employee>();
	callQueue = new MyQueueImpl<Call>();
    }

    // assigns a call to the first available employee
    public void dispatchCall() {
	Call nextCall = callQueue.dequeue();
	if (!respondentQueue.isEmpty()) {
	    Employee employee = respondentQueue.dequeue();
	    // assign call
	    employee.setCurrentCall(nextCall);
	    employee.setFree(false);
	    int currentLevel = employee.getEmType().getValue();
	    while (employee.getCurrentCall().getProblemLevel().getValue() != currentLevel) {
		// dispatch to higher level
		currentLevel++;
		switch (currentLevel) {
		case 1:
		    if (!managerQueue.isEmpty()) {
			employee = setNextEmployee(managerQueue.dequeue(), employee);
			employee.setCurrentCall(nextCall);
			employee.setFree(false);
		    }
		    break;
		case 2:
		    if (!directorQueue.isEmpty()) {
			employee = setNextEmployee(directorQueue.dequeue(), employee);
			employee.setCurrentCall(nextCall);
			employee.setFree(false);
		    }
		    break;
		}
	    }
	}
    }

    private Employee setNextEmployee(Employee nextEmployee, Employee currentEmployee) {
	// free current employee and put him back into the queue;
	currentEmployee.setFree(true);
	switch (currentEmployee.getEmType().getValue()) {
	case 0:
	    respondentQueue.enqueue(currentEmployee);
	    break;
	case 1:
	    managerQueue.enqueue(currentEmployee);
	    break;
	case 2:
	    directorQueue.enqueue(currentEmployee);
	    break;
	}
	return nextEmployee;
    }
}
