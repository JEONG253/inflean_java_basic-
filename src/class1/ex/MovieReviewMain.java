package class1.ex;

public class MovieReviewMain {
        public static void main(String[] args) {

                MovieReview movieReview = new MovieReview();
                movieReview.title = "인셉션";
                movieReview.review = "인생은 무한 루프";

                MovieReview movieReview1 = new MovieReview();
                movieReview1.title = "어바웃 타임";
                movieReview1.review = "인생 시간 영화!";

                MovieReview[] movieReviews = new MovieReview[]{movieReview, movieReview1};

                for (MovieReview mr : movieReviews) {
                        System.out.println("영화 제목 : " + mr.title + " , 리뷰 : " + mr.review);
                }

        }
}
