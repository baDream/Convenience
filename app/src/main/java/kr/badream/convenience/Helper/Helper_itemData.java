package kr.badream.convenience.Helper;


import java.io.Serializable;
import java.util.ArrayList;

import kr.badream.convenience.R;

/**
 * Created by user on 16. 3. 2.
 */

//방정보를 저장할 자료형 클래스
public class Helper_itemData implements Serializable {

    //storeID
    // CU = 1
    // Withme = 2
    // GS = 3
    // Seven = 4
    // mini = 5


    public int prodID;
    public int storeID;
    public int mainCategory;
    public int subCategory;

    public String url;
    public String name;
    public String price;

    public int likes;
    public int reviews;
    public int views;

    public int isLiked;

    public Helper_itemData(){
    }

    public Helper_itemData(int prodID, int storeID, int mainCategory, int subCategory, String url, String name, String price, int likes, int reviews, int views, int isLiked){
        this.prodID = prodID;
        this.storeID = storeID;
        this.mainCategory = mainCategory;
        this.subCategory = subCategory;
        this.url = url;
        this.name = name;
        this.price = price;
        this.likes = likes;
        this.reviews = reviews;
        this.views = views;
        this.isLiked = isLiked;
    }

    public Helper_itemData(int prodID, int storeID, int mainCategory, int subCategory, String url, String name, String price, int likes, int reviews, int views){
        this.prodID = prodID;
        this.storeID = storeID;
        this.mainCategory = mainCategory;
        this.subCategory = subCategory;
        this.url = url;
        this.name = name;
        this.price = price;
        this.likes = likes;
        this.reviews = reviews;
        this.views = views;
    }

    @Override
    public String toString(){
        return name;
    }
}
