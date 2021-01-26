package classpart;

public class orderTest {

	public static void main(String[] args) {
		Order order1 = new Order();
		
		order1.setOrder("201803120001","abc123" ,"2018년 3월 12일" , "홍길순", "pd345-12", "서울시 영등포구 여의도동 20번지");
		
		order1.getOrder();
	}

}
