class DemoNewBranch{
    public static void main(String[] args) {
        System.out.println("okok, file created in new  brnach");
        Nested n = new Nested();
    }

}
class Nested{
    int data;
    Nested(){
        data=25;
    }
}