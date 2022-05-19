package pl.click;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <0 ){
            return -1;
        } else {

            int bobToBuy = 0;
            double area = width * height;

            double bobNeedsBuckets = area / areaPerBucket;

            bobToBuy = (int) Math.ceil(bobNeedsBuckets) - extraBuckets;



            return bobToBuy;

        }

    }

    public static  int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            int bobToBuy = 0;
            double area = width * height;

            double bobNeedsBuckets = area / areaPerBucket;

            bobToBuy = (int) Math.ceil(bobNeedsBuckets);



            return bobToBuy;

        }
    }
    public static  int getBucketCount(double area,double areaPerBucket){

        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            int bobToBuy = 0;

            bobToBuy = (int) Math.ceil(area/areaPerBucket);

            return bobToBuy;
        }

    }
}
