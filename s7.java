class room
{
private int l,b;
room(int p,int q)
{ l=p; b=q;}
int area()
{
return(l*b);
}
}
class class_room extends room
{
int h ;
class_room(int p,int q, int r)
{
super(p,q)
{
h=r;
}
int volume
{
return (area()*h);
}
}
class s7
{
public static void main(String args[])
{
class_room cr=new class_room(10,20,15);
int a1=cr.area();
int v1=cr.volume();
System.out.println("Area of Room : "+a1);
System.out.println("Volume of Room : "+v1);
}
}
