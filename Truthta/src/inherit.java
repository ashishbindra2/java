class Employee {
    private String name;
    private String gender;
    Employee(){ name= " ";
    gender = " ";
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    void showOutput(){
        System.out.println("GeNder of employee "+gender);
        System.out.println("Name of employee "+name);
        System.out.println("**************************************");
    }
}


class Worker extends Employee
{
    private char category;
    private boolean dressallowence;
    Worker(){
        category ='l';
        dressallowence =true;
    }

    public char getCategory() {
        return category;
    }

    public void setDressallowence(boolean dressallowence) {
        this.dressallowence = dressallowence;
    }

    public void setCategory(char category) {
        this.category = category;
    }
    public boolean getDressallowence(){
        return dressallowence;
    }
    void showOutput(){

        System.out.println("Category of Worker "+category);
        System.out.println("dreassAllowece of Worker"+dressallowence);
        System.out.println("**************************************");
        super.showOutput();
        System.out.println("**************************************");
    }

}



class Officer extends Employee
{
    private char category;
    private int experience;
    private boolean vehicle;
    Officer(){
        category = 'd';
        experience = 5;
        vehicle = false;
    }

    public char getCategory() {
        return category;
    }

    public int getExperience() {
        return experience;
    }
    public boolean getVehicle() {
        return vehicle;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setVehicle(boolean vehicle) {
        this.vehicle = vehicle;
    }
    void showOutput(){
        System.out.println("Category of Officer:-"+category);
        System.out.println("Experiece of Officer:-"+experience);
        System.out.println("Vehical of Officer:-"+vehicle);
        System.out.println("**************************************");
    }
    void display(){
        showOutput();
        super.showOutput();
        //  System.out.println("**************************************");
        //  System.out.println("**************************************");
    }
}


public class inherit {
    public static void main(String[] args) {
        Worker w = new Worker();
        Officer o = new Officer();
        System.out.println("**************************************");
        System.out.println(w.getCategory());
        System.out.println(o.getCategory());
        System.out.println("**************************************");
        o.setCategory('t');
        o.setCategory('t');
        // super.showOutput();
        o.display();
        o.showOutput();

    }
}
