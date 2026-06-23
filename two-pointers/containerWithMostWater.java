package two-pointers;

public class containerWithMostWater {
     public int maxArea(int[] height) {
//         int len=height.length;
//         int units=len-1;
//         int max=0,value,e=0,h;
//         while(units>0){
//             if(height[len-1]<height[e])
//              h=height[len-1];
//             else
// h=height[e];
//         value=h*units;
//         if(value>max)
//         max=value;
//         e++;
//         units--;
//         }
//         return max;
//-------------------------------
// int len=height.length;
// int mid=len/2;
// int value,max=0,h;
// for(int i=0;i<len-1;i++){
//     for(int j=i+1;j<len;j++){
//         if(height[i]<height[j])
//         h=height[i];
//         else
//         h=height[j];
// value=h*(j-i);
// if(value>max)
// max=value;
//     }
// }
// return max;
//------------------------------
int len=height.length;
int i=0,j=len-1,h,value,max=0;
while(i<j){
if(height[i]<height[j]){
h=height[i];
value=h*(j-i);
i++;
}
else{
h=height[j];
value=h*(j-i);
j--;
}
if(max<value)
max=value;
}
return max;
    }
}
