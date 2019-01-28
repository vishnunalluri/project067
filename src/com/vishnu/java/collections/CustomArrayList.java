package com.vishnu.java.collections;

import java.sql.SQLOutput;

public class CustomArrayList
{
 private int [] list ;//= new int[2];

    public CustomArrayList(){
        list = new int[2];
    }

    public CustomArrayList(int size){
        list = new int[size];
    }
 private int index =0;
 public void add(int value)
 {
     if(list.length > index)
     {

         list[index] = value;
         index++;
     }
     else{
         int newsize = list.length+(list.length/2);

         int [] newlist = new int[newsize];

         for(int itr =0; itr < list.length;itr++){
             newlist[itr]=list[itr];
         }
         newlist[index]=value;
         index++;
         list=newlist;
     }
 }


    public boolean removeL1(int value) {
        for(int itr=0;itr<=list.length;itr++)
            if (list[itr] == value) {
               // System.out.println(list[itr]);
                list[itr] = 0;
                //System.out.println(list[itr]);
                break;
            }
        return true;
    }

    public boolean removeL2(int value) {
     int index=0;
        for( index=0;index < list.length;index++)
            if (list[index] != value) {
                 System.out.println(list[index]);
                 int [] list2 = new int[list.length-1];

                     list2[index]=list[index];

                 list = list2;
                System.out.println(list[index]);
                //break;
            }
        return true;
    }

    @Override
    public String toString() {
     String returnValue ="[";
         for (int iter =0; iter<list.length; iter++) {
        returnValue =   returnValue.concat(list[iter] + ",");
         }
      returnValue =  returnValue.concat("]");
        return returnValue;
    }
}
