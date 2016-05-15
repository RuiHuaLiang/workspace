package extend;

import java.util.Arrays;

public class Paper {
	private SingleChoice[] singles;//�����ѡ��
	private MutilChoice[] mutis;//�����ѡ��

	public Paper(){
		
	}
	public Paper(SingleChoice[] singles, MutilChoice[] mutis) {
		this.singles = singles;
		this.mutis = mutis;
	}
	
	

	public SingleChoice[] getSingles() {
		return singles;
	}
	public void setSingles(SingleChoice[] singles) {
		this.singles = singles;
	}
	public MutilChoice[] getMutis() {
		return mutis;
	}
	public void setMutis(MutilChoice[] mutis) {
		this.mutis = mutis;
	}
	
	//��ӵ�ѡ�⵽�Ծ���
	public void addSingleChoice(SingleChoice single){
		//����
		this.singles = Arrays.copyOf(this.singles, this.singles.length+1);
		//������ֵ����������һ���ռ�
		this.singles[singles.length-1] = single;
	}
	
	//��Ӷ�ѡ���Ծ���
	public void addMutilChoice(MutilChoice muti){
		this.mutis = Arrays.copyOf(this.mutis, this.mutis.length+1);
		//������ֵ����������һ���ռ�
		this.mutis[mutis.length-1] = muti;
		
	}
	
	public void removeSingleChoice(SingleChoice single){
		//1.���Ҷ���  index:������±�
		int index = findSingle(single);
		
		//���䣺�ж�index
		if(index == -1){  //����ѯsingle�����������в����ڣ���ô�ͻ᷵��-1
			return ;
		}
		//2.�����еĺ�һ�����󸲸�ǰһ������
		for(;index <this.singles.length-1;index++){
			this.singles[index] = this.singles[index+1];
		}
		//3.ɾ�����һ�������ҽ���������
		this.singles = Arrays.copyOf(this.singles,this.singles.length-1);
	}
	
	//�������в��ҵ�ѡ��
	private int findSingle(SingleChoice single){
		//�������еĶ���һһȡ����single����Ƚ�
		for(int i =0 ; i <this.singles.length; i++){
			SingleChoice s = this.singles[i];
			if(s.getId() == single.getId()){
				return i;
			}	
		}
		return -1;
	} 
	//�������в��ҵ�ѡ��
	private int findMutil(MutilChoice muti){
		//�������еĶ���һһȡ����single����Ƚ�
		for(int i =0 ; i <this.mutis.length; i++){
			MutilChoice m = this.mutis[i];
			if(m.getId() == muti.getId()){
				return i;
			}	
		}
		return -1;
	} 

	public void removeMutilChoice(MutilChoice muti){
		//1.���Ҷ���  index:������±�
		int index = findMutil(muti);
		
		//���䣺�ж�index
		if(index == -1){  //����ѯsingle�����������в����ڣ���ô�ͻ᷵��-1
			return ;
		}
		//2.�����еĺ�һ�����󸲸�ǰһ������
		for(;index <this.mutis.length-1;index++){
			this.mutis[index] = this.mutis[index+1];
		}
		//3.ɾ�����һ�������ҽ���������
		this.mutis = Arrays.copyOf(this.mutis,this.mutis.length-1);
	}	
	
}
