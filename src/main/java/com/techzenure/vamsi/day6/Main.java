package com.techzenure.vamsi.day6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hosteller hosteller = getHostellerDetails();
        
        System.out.println("\nThe Student Details are as follows:");
        System.out.println("Student ID: " + hosteller.getStudentId());
        System.out.println("Student Name: " + hosteller.getName());
        System.out.println("Department ID: " + hosteller.getDepartmentId());
        System.out.println("Student Gender: " + hosteller.getGender());
        System.out.println("Student Phone No: " + hosteller.getPhone());
        System.out.println("Hostel Name: " + hosteller.getHostelName());
        System.out.println("Room No: " + hosteller.getRoomNumber());
    }
    
    public static Hosteller getHostellerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Details & Hostel Details:");
        
        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        
        System.out.print("Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Department ID: ");
        int departmentId = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        
        System.out.print("Gender[M/F]: ");
        String gender = scanner.nextLine();
        
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        
        System.out.print("\nHostel Name: ");
        String hostelName = scanner.nextLine();
        
        System.out.print("Room Number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        
        Hosteller hosteller = new Hosteller(hostelName, roomNumber);
        hosteller.setStudentId(studentId);
        hosteller.setName(name);
        hosteller.setDepartmentId(departmentId);
        hosteller.setGender(gender);
        hosteller.setPhone(phone);
        
        System.out.print("Modify Room Number(Y/N): ");
        String modifyRoom = scanner.nextLine();
        if (modifyRoom.equalsIgnoreCase("Y")) {
            System.out.print("New Room Number: ");
            int newRoomNumber = scanner.nextInt();
            hosteller.setRoomNumber(newRoomNumber);
        }
        
        System.out.print("Modify Phone Number(Y/N): ");
        String modifyPhone = scanner.nextLine();
        if (modifyPhone.equalsIgnoreCase("Y")) {
            System.out.print("New Phone Number: ");
            String newPhone = scanner.nextLine();
            hosteller.setPhone(newPhone);
        }
        
        scanner.close();
        return hosteller;
    }
}

class Student {
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class Hosteller extends Student {
    private String hostelName;
    private int roomNumber;

    public Hosteller(String hostelName, int roomNumber) {
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}