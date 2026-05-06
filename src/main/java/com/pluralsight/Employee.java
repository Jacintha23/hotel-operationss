package com.pluralsight;

    public class Employee
{
        private int employeeId;
        private String name;
        private String department;
        private double payRate;
        private double hoursWorked;
        private double regularHours;
        private double overTimeHours;
        private double totalPay;
        private int punchInTime;
        private int punchOutTime;
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, double regularHours, double overTimeHours, double totalPay)
        {
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.payRate = payRate;
            this.hoursWorked = hoursWorked;
            this.regularHours = regularHours;
            this.overTimeHours = overTimeHours;
            this.totalPay = totalPay;
        }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        return regularHours;
    }

    public void setRegularHours(double regularHours) {
        this.regularHours = regularHours;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public void punchIn(int hour) //<---- set a variable
    {
        //There are less than two conditions/choices, use if statement over switch
        //Each time the employee punches in, we will track their start time
        //Each function will take an int as an input argument
        //Employees will always clock in at the top of the hour. In 24-hour time.
        if(hour < 1 || hour > 24)
        { //This is an exception for if employees hours are over 24 hour
            // use the throw statement to manually signal that something unexpected has happened
            throw new RuntimeException("You must have hours between 1 and 24");
        }



    }

    public void punchOut(int hour)
    {
        int startTime = hour;

        if(startTime == 0)
        {
            throw new RuntimeException("You can't clock out unless you have clocked in");
        }
        if(hour < 1 || hour > 24)
        {
            throw new RuntimeException("You must have hours between 1 and 24");
        }


    }





}
