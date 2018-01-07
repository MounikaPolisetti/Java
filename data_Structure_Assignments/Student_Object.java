package data_Structure_Assignments;

public class Student_Object {
	public int id;
	public String name;
	public int marks;
	
	Student_Object(int id,String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString(){
		return (this.id+ " "+ this.name+ " "+this.marks);
	}
	
	public static void main(String[] args) {
		Stack_Of_Objects stk_Of_Obj= new Stack_Of_Objects(5);
		Student_Object stu_Obj1= new Student_Object(12,"adi",65);
		stk_Of_Obj.push(stu_Obj1);
		
		/* Or use this following one liner
		 * stk_Of_Obj.push(new Student_Object(11,"abi",80));
		 */
		
		Student_Object stu_Obj2= new Student_Object(12,"beena",75);
		stk_Of_Obj.push(stu_Obj2);
		Student_Object stu_Obj3= new Student_Object(13,"diya",95);
		stk_Of_Obj.push(stu_Obj3);
		Student_Object stu_Obj4= new Student_Object(14,"erad",85);
		stk_Of_Obj.push(stu_Obj4);
		Student_Object stu_Obj5= new Student_Object(15,"daya",80);
		stk_Of_Obj.push(stu_Obj5);
		stk_Of_Obj.display();

		
	}

}
