/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author DURGA
 */
class User
{
    private int id,age;
    private long contactno;
    private String name,gender,bloodgpString,addressString,anymajorString;
    public User(int id,String name,long contactno,int age,String gender,String bloodgpString,String addressString,String anymajorString)
    {
        this.id=id;
        this.name=name;
        this.contactno=contactno;
        this.age=age;
        this.gender=gender;
        this.bloodgpString=bloodgpString;
        this.addressString=addressString;
        this.anymajorString=anymajorString;
        
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public long getContactno()
    {
        return contactno;
    }
    public int getage()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
        
    }
    public String getBloodgp()
    {
        return bloodgpString;
    }
    public String getAddress()
    {
        return addressString;
    }
    public String getAnymajor()
    {
        return anymajorString;
    }
}
