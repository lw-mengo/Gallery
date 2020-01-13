package com.mengo.gallery.beans;

import java.util.List;

public class Pixabay {

    /**
     * totalHits : 500
     * hits : [{"largeImageURL":"https://pixabay.com/get/55e0d340485aa814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":1062,"imageWidth":6000,"id":3063284,"user_id":1564471,"views":687017,"comments":240,"pageURL":"https://pixabay.com/photos/rose-flower-petal-floral-noble-3063284/","imageHeight":4000,"webformatURL":"https://pixabay.com/get/55e0d340485aa814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"rose, flower, petal","downloads":433756,"user":"annca","favorites":913,"imageSize":3574625,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2015/11/27/06-58-54-609_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/01/05/16/24/rose-3063284_150.jpg"},{"largeImageURL":"https://pixabay.com/get/55e1d4404953a414f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":809,"imageWidth":2736,"id":3113318,"user_id":7410713,"views":447214,"comments":124,"pageURL":"https://pixabay.com/photos/sunflower-nature-flora-flower-3113318/","imageHeight":1824,"webformatURL":"https://pixabay.com/get/55e1d4404953a414f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"sunflower, nature, flora","downloads":325629,"user":"bichnguyenvo","favorites":542,"imageSize":1026006,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2017/12/16/10-28-39-199_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/01/28/11/24/sunflower-3113318_150.jpg"},{"largeImageURL":"https://pixabay.com/get/55e2dc414351ae14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":400,"webformatWidth":640,"likes":800,"imageWidth":3200,"id":3292932,"user_id":2216431,"views":396618,"comments":73,"pageURL":"https://pixabay.com/photos/sunflower-vase-vintage-retro-wall-3292932/","imageHeight":2000,"webformatURL":"https://pixabay.com/get/55e2dc414351ae14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":93,"tags":"sunflower, vase, vintage","downloads":297332,"user":"Yuri_B","favorites":1002,"imageSize":2563708,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/12/17/10-34-13-667_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/04/05/14/09/sunflower-3292932_150.jpg"},{"largeImageURL":"https://pixabay.com/get/54e2dc464e51a814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":861,"imageWidth":5363,"id":2295434,"user_id":334088,"views":151417,"comments":72,"pageURL":"https://pixabay.com/photos/spring-bird-bird-tit-spring-blue-2295434/","imageHeight":3575,"webformatURL":"https://pixabay.com/get/54e2dc464e51a814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"spring bird, bird, tit","downloads":66142,"user":"JillWellington","favorites":955,"imageSize":2938651,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2018/06/27/01-23-02-27_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2017/05/08/13/15/spring-bird-2295434_150.jpg"},{"largeImageURL":"https://pixabay.com/get/54e1d1464f51a514f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":390,"webformatWidth":640,"likes":446,"imageWidth":4000,"id":2145539,"user_id":2364555,"views":58487,"comments":34,"pageURL":"https://pixabay.com/photos/crocus-flower-wet-spring-2145539/","imageHeight":2443,"webformatURL":"https://pixabay.com/get/54e1d1464f51a514f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":91,"tags":"crocus, flower, wet","downloads":33596,"user":"pixel2013","favorites":405,"imageSize":823922,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/07/15/18-51-07-612_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2017/03/15/09/00/crocus-2145539_150.jpg"},{"largeImageURL":"https://pixabay.com/get/57e5d4414253af14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":323,"webformatWidth":640,"likes":325,"imageWidth":3861,"id":1512813,"user_id":2364555,"views":89755,"comments":24,"pageURL":"https://pixabay.com/photos/lily-flowers-early-flower-garden-1512813/","imageHeight":1952,"webformatURL":"https://pixabay.com/get/57e5d4414253af14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":75,"tags":"lily, flowers, early","downloads":43722,"user":"pixel2013","favorites":342,"imageSize":1037708,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/07/15/18-51-07-612_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/07/12/18/54/lily-1512813_150.jpg"},{"largeImageURL":"https://pixabay.com/get/51e1d0464e52b108f5d08460962933761c3adce4534c704c722773dd944bc151_1280.jpg","webformatHeight":360,"webformatWidth":640,"likes":305,"imageWidth":3020,"id":715540,"user_id":916237,"views":101302,"comments":34,"pageURL":"https://pixabay.com/photos/yellow-natural-flower-blossom-715540/","imageHeight":1703,"webformatURL":"https://pixabay.com/get/51e1d0464e52b108f5d08460962933761c3adce4534c704c722773dd944bc151_640.jpg","type":"photo","previewHeight":84,"tags":"yellow, natural, flower","downloads":51394,"user":"Wow_Pho","favorites":319,"imageSize":974940,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2015/04/07/14-10-15-590_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2015/04/10/00/41/yellow-715540_150.jpg"},{"largeImageURL":"https://pixabay.com/get/53e6d1424e4fad0bffd8992cc62c3f77103ddfe54e50744e7d2772d79149cc_1280.jpg","webformatHeight":428,"webformatWidth":640,"likes":564,"imageWidth":3872,"id":56414,"user_id":9003,"views":83988,"comments":83,"pageURL":"https://pixabay.com/photos/anemone-flower-blossom-bloom-blue-56414/","imageHeight":2592,"webformatURL":"https://pixabay.com/get/53e6d1424e4fad0bffd8992cc62c3f77103ddfe54e50744e7d2772d79149cc_640.jpg","type":"photo","previewHeight":100,"tags":"anemone, flower, blossom","downloads":36189,"user":"Albenheim","favorites":481,"imageSize":770723,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2012/09/08/21-14-56-990_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2012/09/08/21/51/anemone-56414_150.jpg"},{"largeImageURL":"https://pixabay.com/get/57e9d2414e53ad14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":372,"webformatWidth":640,"likes":297,"imageWidth":4288,"id":1972411,"user_id":1777190,"views":97357,"comments":35,"pageURL":"https://pixabay.com/photos/drip-blossom-bloom-yellow-1972411/","imageHeight":2499,"webformatURL":"https://pixabay.com/get/57e9d2414e53ad14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":87,"tags":"drip, blossom, bloom","downloads":81175,"user":"susannp4","favorites":292,"imageSize":1510459,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2015/12/16/17-56-55-832_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2017/01/11/17/27/drip-1972411_150.jpg"},{"largeImageURL":"https://pixabay.com/get/55e7d743495aaf14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":194,"imageWidth":6000,"id":3720383,"user_id":6246704,"views":61590,"comments":42,"pageURL":"https://pixabay.com/photos/flower-g%C3%A9rbel-yellow-flower-flower-3720383/","imageHeight":4000,"webformatURL":"https://pixabay.com/get/55e7d743495aaf14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"flower gérbel, yellow flower, flower","downloads":49621,"user":"fernandozhiminaicela","favorites":165,"imageSize":2117262,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/02/27/14-16-13-192_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/10/03/03/42/flower-gerbel-3720383_150.jpg"},{"largeImageURL":"https://pixabay.com/get/57e5d6454a5aa414f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":419,"webformatWidth":640,"likes":314,"imageWidth":4896,"id":1536088,"user_id":1195798,"views":296673,"comments":58,"pageURL":"https://pixabay.com/photos/sunflower-flower-bloom-yellow-1536088/","imageHeight":3208,"webformatURL":"https://pixabay.com/get/57e5d6454a5aa414f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":98,"tags":"sunflower, flower, bloom","downloads":54848,"user":"Couleur","favorites":285,"imageSize":5103399,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/12/27/15-33-37-393_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/07/23/00/12/sun-flower-1536088_150.jpg"},{"largeImageURL":"https://pixabay.com/get/55e0d0434a55aa14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":333,"imageWidth":5472,"id":3050076,"user_id":6663646,"views":152901,"comments":32,"pageURL":"https://pixabay.com/photos/portrait-girl-fog-flowers-beauty-3050076/","imageHeight":3648,"webformatURL":"https://pixabay.com/get/55e0d0434a55aa14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"portrait, girl, fog","downloads":106460,"user":"ThuyHaBich","favorites":340,"imageSize":2914111,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2017/11/17/08-35-57-188_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2017/12/30/13/25/portrait-3050076_150.jpg"},{"largeImageURL":"https://pixabay.com/get/55e2d4464b5aa414f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":358,"webformatWidth":640,"likes":390,"imageWidth":2027,"id":3215188,"user_id":7097598,"views":156197,"comments":102,"pageURL":"https://pixabay.com/photos/flowers-orange-orange-petals-3215188/","imageHeight":1134,"webformatURL":"https://pixabay.com/get/55e2d4464b5aa414f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":83,"tags":"flowers, orange, orange petals","downloads":106384,"user":"Candiix","favorites":330,"imageSize":399066,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2017/12/06/20-08-45-84_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/03/10/20/26/flowers-3215188_150.jpg"},{"largeImageURL":"https://pixabay.com/get/57e1d6444957b108f5d08460962933761c3adce4534c704c722773dd944bc151_1280.jpg","webformatHeight":355,"webformatWidth":640,"likes":217,"imageWidth":2410,"id":113735,"user_id":817,"views":106307,"comments":31,"pageURL":"https://pixabay.com/photos/rose-flower-yellow-yellow-rose-113735/","imageHeight":1337,"webformatURL":"https://pixabay.com/get/57e1d6444957b108f5d08460962933761c3adce4534c704c722773dd944bc151_640.jpg","type":"photo","previewHeight":83,"tags":"rose, flower, yellow","downloads":20731,"user":"blizniak","favorites":199,"imageSize":299425,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2013/06/28/17-07-05-714_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2013/05/26/12/14/rose-113735_150.jpg"},{"largeImageURL":"https://pixabay.com/get/57e3d44a4b53a814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":297,"imageWidth":4272,"id":1319114,"user_id":485024,"views":103448,"comments":25,"pageURL":"https://pixabay.com/photos/girl-flowers-yellow-beauty-nature-1319114/","imageHeight":2848,"webformatURL":"https://pixabay.com/get/57e3d44a4b53a814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"girl, flowers, yellow","downloads":50174,"user":"AdinaVoicu","favorites":300,"imageSize":3837334,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/11/08/12-57-56-969_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/04/09/23/10/girl-1319114_150.jpg"},{"largeImageURL":"https://pixabay.com/get/57e6d7444b5baf14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":309,"imageWidth":6000,"id":1627193,"user_id":1834854,"views":122302,"comments":42,"pageURL":"https://pixabay.com/photos/sunflower-sunflower-field-yellow-1627193/","imageHeight":4000,"webformatURL":"https://pixabay.com/get/57e6d7444b5baf14f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"sunflower, sunflower field, yellow","downloads":36907,"user":"ulleo","favorites":357,"imageSize":5414839,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/05/16/18-48-21-135_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/08/28/23/24/sunflower-1627193_150.jpg"},{"largeImageURL":"https://pixabay.com/get/57e1d7444b55a814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":472,"imageWidth":4752,"id":1127174,"user_id":1445608,"views":144413,"comments":35,"pageURL":"https://pixabay.com/photos/sunflower-summer-yellow-nature-1127174/","imageHeight":3168,"webformatURL":"https://pixabay.com/get/57e1d7444b55a814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"sunflower, summer, yellow","downloads":84635,"user":"mploscar","favorites":504,"imageSize":3922163,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2016/01/05/14-08-20-943_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/01/08/05/24/sunflower-1127174_150.jpg"},{"largeImageURL":"https://pixabay.com/get/5ee8d2474e51b108f5d08460962933761c3adce4534c704c722773dd944bc151_1280.jpg","webformatHeight":497,"webformatWidth":640,"likes":484,"imageWidth":3867,"id":887443,"user_id":1298145,"views":96812,"comments":58,"pageURL":"https://pixabay.com/photos/flower-life-crack-desert-drought-887443/","imageHeight":3005,"webformatURL":"https://pixabay.com/get/5ee8d2474e51b108f5d08460962933761c3adce4534c704c722773dd944bc151_640.jpg","type":"photo","previewHeight":116,"tags":"flower, life, crack","downloads":48516,"user":"klimkin","favorites":394,"imageSize":2611531,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2017/07/18/13-46-18-393_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2015/08/13/20/06/flower-887443_150.jpg"},{"largeImageURL":"https://pixabay.com/get/53e2d646424fad0bffd8992cc62c3f77103ddfe54e50744e7d2772d79149cc_1280.jpg","webformatHeight":360,"webformatWidth":640,"likes":193,"imageWidth":1920,"id":52358,"user_id":5783,"views":35929,"comments":23,"pageURL":"https://pixabay.com/photos/flower-wild-flower-nature-52358/","imageHeight":1080,"webformatURL":"https://pixabay.com/get/53e2d646424fad0bffd8992cc62c3f77103ddfe54e50744e7d2772d79149cc_640.jpg","type":"photo","previewHeight":84,"tags":"flower, wild flower, nature","downloads":14789,"user":"PeterDargatz","favorites":181,"imageSize":172383,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2012/06/22/22-42-41-494_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2012/07/12/14/50/flower-52358_150.jpg"},{"largeImageURL":"https://pixabay.com/get/55e6d1434351a914f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":362,"imageWidth":5574,"id":3640935,"user_id":334088,"views":184340,"comments":67,"pageURL":"https://pixabay.com/photos/sunflowers-field-woman-yellow-3640935/","imageHeight":3717,"webformatURL":"https://pixabay.com/get/55e6d1434351a914f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg","type":"photo","previewHeight":99,"tags":"sunflowers, field, woman","downloads":149286,"user":"JillWellington","favorites":322,"imageSize":4970597,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2018/06/27/01-23-02-27_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/08/29/22/52/sunflowers-3640935_150.jpg"}]
     * total : 22452
     */

    private int totalHits;
    private int total;
    private List<HitsBean> hits;

    public int getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<HitsBean> getHits() {
        return hits;
    }

    public void setHits(List<HitsBean> hits) {
        this.hits = hits;
    }

    public static class HitsBean {
        /**
         * largeImageURL : https://pixabay.com/get/55e0d340485aa814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_1280.jpg
         * webformatHeight : 426
         * webformatWidth : 640
         * likes : 1062
         * imageWidth : 6000
         * id : 3063284
         * user_id : 1564471
         * views : 687017
         * comments : 240
         * pageURL : https://pixabay.com/photos/rose-flower-petal-floral-noble-3063284/
         * imageHeight : 4000
         * webformatURL : https://pixabay.com/get/55e0d340485aa814f6da8c7dda79367a1d36dbe752516c48702873dc9e4ec35cb1_640.jpg
         * type : photo
         * previewHeight : 99
         * tags : rose, flower, petal
         * downloads : 433756
         * user : annca
         * favorites : 913
         * imageSize : 3574625
         * previewWidth : 150
         * userImageURL : https://cdn.pixabay.com/user/2015/11/27/06-58-54-609_250x250.jpg
         * previewURL : https://cdn.pixabay.com/photo/2018/01/05/16/24/rose-3063284_150.jpg
         */

        private String largeImageURL;
        private int webformatHeight;
        private int webformatWidth;
        private int likes;
        private int imageWidth;
        private int id;
        private int user_id;
        private int views;
        private int comments;
        private String pageURL;
        private int imageHeight;
        private String webformatURL;
        private String type;
        private int previewHeight;
        private String tags;
        private int downloads;
        private String user;
        private int favorites;
        private int imageSize;
        private int previewWidth;
        private String userImageURL;
        private String previewURL;

        public String getLargeImageURL() {
            return largeImageURL;
        }

        public void setLargeImageURL(String largeImageURL) {
            this.largeImageURL = largeImageURL;
        }

        public int getWebformatHeight() {
            return webformatHeight;
        }

        public void setWebformatHeight(int webformatHeight) {
            this.webformatHeight = webformatHeight;
        }

        public int getWebformatWidth() {
            return webformatWidth;
        }

        public void setWebformatWidth(int webformatWidth) {
            this.webformatWidth = webformatWidth;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getImageWidth() {
            return imageWidth;
        }

        public void setImageWidth(int imageWidth) {
            this.imageWidth = imageWidth;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public String getPageURL() {
            return pageURL;
        }

        public void setPageURL(String pageURL) {
            this.pageURL = pageURL;
        }

        public int getImageHeight() {
            return imageHeight;
        }

        public void setImageHeight(int imageHeight) {
            this.imageHeight = imageHeight;
        }

        public String getWebformatURL() {
            return webformatURL;
        }

        public void setWebformatURL(String webformatURL) {
            this.webformatURL = webformatURL;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getPreviewHeight() {
            return previewHeight;
        }

        public void setPreviewHeight(int previewHeight) {
            this.previewHeight = previewHeight;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public int getDownloads() {
            return downloads;
        }

        public void setDownloads(int downloads) {
            this.downloads = downloads;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public int getFavorites() {
            return favorites;
        }

        public void setFavorites(int favorites) {
            this.favorites = favorites;
        }

        public int getImageSize() {
            return imageSize;
        }

        public void setImageSize(int imageSize) {
            this.imageSize = imageSize;
        }

        public int getPreviewWidth() {
            return previewWidth;
        }

        public void setPreviewWidth(int previewWidth) {
            this.previewWidth = previewWidth;
        }

        public String getUserImageURL() {
            return userImageURL;
        }

        public void setUserImageURL(String userImageURL) {
            this.userImageURL = userImageURL;
        }

        public String getPreviewURL() {
            return previewURL;
        }

        public void setPreviewURL(String previewURL) {
            this.previewURL = previewURL;
        }
    }
}
