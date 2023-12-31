package com.xworkz.company;

public class MncCompany extends Company {
    @Override
    public void developProduct() {
        System.out.println("Developing product");
    }

    @Override
    public void promoteEmployee() {
        System.out.println("Promoting employee");
    }

    @Override
    public void organizeTraining() {
        System.out.println("Organizing training on");
    }

    @Override
    public void approveLeave() {
        System.out.println("Approving leave for employee");
    }

    @Override
    public void reviewPerformance() {
        System.out.println("Reviewing performance of employee");
    }
}
