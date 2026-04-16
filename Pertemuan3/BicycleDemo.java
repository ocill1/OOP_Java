public class BicycleDemo { 
    public static void main(String[] args) { 
        // membuat objek Bicycle 
        Bicycle myBike = new Bicycle(); 
        // mengubah gear dan kecepatan 
        myBike.speed=10; 
        myBike.gear=2; 
        //memanggil method untuk mengubah gear dan kecepatan 
        myBike.speedUp(10); 
        myBike.changeGear(2); 
    } 
  }
