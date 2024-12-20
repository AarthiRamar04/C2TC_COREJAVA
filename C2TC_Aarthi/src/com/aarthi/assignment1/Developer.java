package com.aarthi.assignment1;

public class Developer extends Employee {
	    private String programmingLanguage;

	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    // Getters and Setters
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", ProgrammingLanguage=" + programmingLanguage;
	    }


}
