package com.example.animeworld.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result implements Parcelable {

        @SerializedName("data")
        @Expose
        private List<Anime> data;
        @SerializedName("pagination")
        @Expose
        private Pagination pagination;

        public List<Anime> getData() {
            return data;
        }

        public void setData(List<Anime> data) {
            this.data = data;
        }

        public Pagination getPagination() {
            return pagination;
        }

        public void setPagination(Pagination pagination) {
            this.pagination = pagination;
        }


        public final static Parcelable.Creator<Result> CREATOR = new Creator<Result>() {
            @Override
            public Result createFromParcel(Parcel source) {
                return new Result(source);
            }

            @Override
            public Result[] newArray(int size) {
                return (new Result[size]);
            }
        };

    public Result() {

    }


    public Result(Parcel in) {
        this.data = (( List<Anime>) in.readValue((Integer.class.getClassLoader())));
        this.pagination = ((Pagination) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.data, (com.example.animeworld.model.Anime.class.getClassLoader()));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {

        dest.writeValue(data);
        dest.writeValue(pagination);

    }
}
