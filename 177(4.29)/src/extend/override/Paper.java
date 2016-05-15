package extend.override;

import java.util.Arrays;

public class Paper {
	private Choice[] singles;//多个单选题
	private Choice[] mutis;//多个多选题

	public Paper(){
		
	}
	public Paper(Choice[] singles, Choice[] mutis) {
		this.singles = singles;
		this.mutis = mutis;
	}
	
	

	public Choice[] getSingles() {
		return singles;
	}
	public void setSingles(Choice[] singles) {
		this.singles = singles;
	}
	public Choice[] getMutis() {
		return mutis;
	}
	public void setMutis(Choice[] mutis) {
		this.mutis = mutis;
	}
	
	//添加单选题到试卷中
	public void addSingleChoice(SingleChoice single){
		//扩容
		this.singles = Arrays.copyOf(this.singles, this.singles.length+1);
		//将对象赋值给数组的最后一个空间
		this.singles[singles.length-1] = single;
	}
	
	//添加多选题试卷中
	public void addMutilChoice(MutilChoice muti){
		this.mutis = Arrays.copyOf(this.mutis, this.mutis.length+1);
		//将对象赋值给数组的最后一个空间
		this.mutis[mutis.length-1] = muti;
		
	}
	
	public void removeSingleChoice(SingleChoice single){
		//1.查找对象  index:数组的下标
		int index = findSingle(single);
		
		//补充：判断index
		if(index == -1){  //当查询single对象在数组中不存在，那么就会返回-1
			return ;
		}
		//2.数组中的后一个对象覆盖前一个对象
		for(;index <this.singles.length-1;index++){
			this.singles[index] = this.singles[index+1];
		}
		//3.删除最后一个对象并且将数组缩容
		this.singles = Arrays.copyOf(this.singles,this.singles.length-1);
	}
	
	//在数组中查找单选题
	private int findSingle(SingleChoice single){
		//将数组中的对象一一取出和single对象比较
		for(int i =0 ; i <this.singles.length; i++){
			SingleChoice s = (SingleChoice)this.singles[i];
			if(s.getId() == single.getId()){
				return i;
			}	
		}
		return -1;
	} 
	//在数组中查找单选题
	private int findMutil(MutilChoice muti){
		//将数组中的对象一一取出和single对象比较
		for(int i =0 ; i <this.mutis.length; i++){
			MutilChoice m = (MutilChoice)this.mutis[i];
			if(m.getId() == muti.getId()){
				return i;
			}	
		}
		return -1;
	} 

	public void removeMutilChoice(MutilChoice muti){
		//1.查找对象  index:数组的下标
		int index = findMutil(muti);
		
		//补充：判断index
		if(index == -1){  //当查询single对象在数组中不存在，那么就会返回-1
			return ;
		}
		//2.数组中的后一个对象覆盖前一个对象
		for(;index <this.mutis.length-1;index++){
			this.mutis[index] = this.mutis[index+1];
		}
		//3.删除最后一个对象并且将数组缩容
		this.mutis = Arrays.copyOf(this.mutis,this.mutis.length-1);
	}	
	
}
