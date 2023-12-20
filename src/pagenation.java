

public class pagenation {
    public static void main(String[] args) {

          int arr[]={1,2,3,4,5};

          int pageSize=2;

          int lastarryIndex = arr.length/pageSize;

          for(int i=0; i<lastarryIndex; i++){//for(i=1; 1<5; i++);

              for (int j=i*pageSize; j<pageSize+(i*pageSize); j++){//for(j=1*2=2; 2<2+(1*2)=2<4=true; j++);

                  System.out.println("Page:  " +i+"  Slide  "+arr[j]);
              }
          }
    }
}