//HCF using formula
class HCF{
  public static int hcfFind(int num1,int num2){

    

    while(num1!=num2){
      if(num1>num2){
        num1 = num1 - num2;
      }
      else{
      num2 = num2-num1;
      }
    }
    return num1;

  }
  public static void main (String[] args) {
    int hcf = hcfFind(36,60);
    System.out.println("Hcf is "+hcf);
  }
}
