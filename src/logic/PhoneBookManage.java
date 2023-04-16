package logic;

import astract.IPhone;
import astract.Phone;
import describe.Contract;
import describe.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManage extends Phone implements IPhone {
    private String name;
    private List<Phone>phoneList=new ArrayList<>();

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort(String name) {
        IPhone.super.sort(name);
    }

    public PhoneBookManage(String name, List<Phone> phoneList) {
        this.name = name;
        this.phoneList = phoneList;
    }

    @Override
    public void display(Type type) {
        for (Phone phone:phoneList) {
            System.out.println(phone);

        }
    }

    @Override
    public void insertPhone(Contract contract) {
        for (Phone phone :phoneList) {
            Contract contract1= phone instanceof Contract?((Contract)phone):null;
            if(contract1==contract){
                System.out.println(contract1);
            }
            else {
                System.out.println("khong ton tai");
            }
        }
    }

    @Override
    public void removePhone(String name) {
        int count=0;
        for (Phone phone1:phoneList) {
            Contract contract=phone1 instanceof Contract?((Contract) phone1):null;
            if(name.equals(contract.name())){
                phoneList.remove(contract);
                return;
            }else {
                count++;
            }
        }
    }
    public void removeContract(int id){
        int count=0;
        for (Phone phone:phoneList) {
            Type type=phone instanceof  Type ? ((Type)phone):null;
            if (id==type.id()){
                phoneList.remove(type);
            }

        }
    }

    @Override
    public void updatePhone(String name, Type newPhone) {
        for (Phone phone :phoneList) {
            Type type=phone instanceof Type?((Type) phone):null;
            if(name.equals(type.name())) {
            type.setName(name,newPhone());
            }
        }
    }
    public String newPhone(){
        System.out.println("nhap lai id");
        Scanner scanner =new Scanner(System.in);
        int id=scanner.nextInt();
        System.out.println("nhap lai ten");
        String name=scanner.nextLine();
        System.out.println("nhap lai cong ty");
        String cp=scanner.nextLine();
        Type type=new Type(id,name,cp);
        return String.valueOf(type);


    }
}
