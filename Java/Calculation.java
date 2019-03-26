    class Calculation{ 
		  void sum(long a,long b){
			  System.out.println("long arg method invoked");
			  }  
      void sum(int a,int b){
		  System.out.println(a+b);
		  }  
  
      public static void main(String args[]){  
      Calculation obj=new Calculation();  
      obj.sum(20,20);//now int arg sum() method gets invoked  
      }  
    }  