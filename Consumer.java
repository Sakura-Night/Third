package 第3次作业;

public class Consumer implements Buy {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void thing() {
        System.out.println("顾客：买一款i9 10980k+rtx3090的电脑");
        store.give(this);
    }

    @Override
    public void get() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("顾客：给孩子上网课买的，孩子很满意");
    }
}
