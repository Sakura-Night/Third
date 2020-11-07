package 第3次作业;

public class Store {
    public void give(Buy Buy) {
        System.out.println("傻戴多:已经接收到了接收到订单，请静待出库");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("顾客:已经三天了还没发货吗，戴尔来点作用啊戴尔");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("傻戴多:亲，这边快递已经出库了");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("傻戴多:亲，快递已经到了，请注意查收，可以的话5星好评支持一下哦，截图给客服还能返现金红包哦");
        Buy.get();
    }
}