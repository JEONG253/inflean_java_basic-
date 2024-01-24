package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            //foreach 문을 사용할 경우 10개를 모두 돌아야 하기 떄문에 넣지 않을 경우 null이 나온다..
            System.out.println("상품명:" + items[i].getProduct() + "금액" +items[i].getTotalPrice());
//            totalPrice += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합:" + totalPrice);
        return totalPrice;
    }


    //    public void addItem(Item item) {
//        if (items.length <= itemCount) {
//            for (int i = 0; i < 10; i++) {
//                items[i] = item;
//            }
//        } else {
//            System.out.println("최대 10개를 초과 하였습니다.");
//        }
//    }
    public void addItem(Item item) {
        // 검증 로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        // 정상 로직
        items[itemCount] = item;
        itemCount++;
    }

}
