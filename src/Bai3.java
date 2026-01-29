public class Bai3 {
    public static class Product {
        private String productId;
        private String productName;
        private float productPrice;

        public Product(String productId, String productName, float productPrice) {
            this.productId = productId;
            this.productName = productName;
            this.productPrice = productPrice;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public float getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(float productPrice) {
            if(productPrice > 0) {
                this.productPrice = productPrice;
                System.out.println("Successfully set product price");
            }else{
                System.out.println("Invalid productPrice");
            }
        }

        public void showProductInfo() {
            System.out.println("-----------Product-----------");
            System.out.println("ProductId: " + this.productId);
            System.out.println("ProductName: " + this.productName);
            System.out.println("ProductPrice: " + this.productPrice);
        }
    }

    public static void main(String[] args) {
        Product product = new Product("01","book", (float) 8.5);
        product.setProductPrice(-5);
        product.setProductPrice(20);
    }
}
