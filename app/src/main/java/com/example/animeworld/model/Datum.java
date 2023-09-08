package com.example.animeworld.model;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;


import java.util.List;
import javax.annotation.Generated;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



@Generated("jsonschema2pojo")
public class Datum extends  BaseObservable implements Parcelable {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("trailer")
    @Expose
    private Trailer trailer;
    @SerializedName("approved")
    @Expose
    private Boolean approved;
    @SerializedName("titles")
    @Expose
    private List<Object> titles;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_english")
    @Expose
    private String titleEnglish;
    @SerializedName("title_japanese")
    @Expose
    private String titleJapanese;
    @SerializedName("title_synonyms")
    @Expose
    private List<Object> titleSynonyms;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("episodes")
    @Expose
    private Integer episodes;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("airing")
    @Expose
    private Boolean airing;
    @SerializedName("aired")
    @Expose
    private Aired aired;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("scored_by")
    @Expose
    private Integer scoredBy;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
    @SerializedName("members")
    @Expose
    private Integer members;
    @SerializedName("favorites")
    @Expose
    private Integer favorites;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("season")
    @Expose
    private String season;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("broadcast")
    @Expose
    private Broadcast broadcast;
    @SerializedName("producers")
    @Expose
    private List<Producer> producers;
    @SerializedName("licensors")
    @Expose
    private List<Licensor> licensors;
    @SerializedName("studios")
    @Expose
    private List<Studio> studios;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres;
    @SerializedName("explicit_genres")
    @Expose
    private List<Object> explicitGenres;
    @SerializedName("themes")
    @Expose
    private List<Object> themes;
    @SerializedName("demographics")
    @Expose
    private List<Object> demographics;


    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Bindable
    public Images getImages() {
        return images;
    }


    public void setImages(Images images) {
        this.images = images;
        notifyPropertyChanged(BR.images);

    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public List<Object> getTitles() {
        return titles;
    }

    public void setTitles(List<Object> titles) {
        this.titles = titles;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    @Bindable
    public String getTitleJapanese() {
        return titleJapanese;

    }

    public void setTitleJapanese(String titleJapanese) {
        this.titleJapanese = titleJapanese;

        notifyPropertyChanged(BR.titleJapanese);
    }

    public List<Object> getTitleSynonyms() {
        return titleSynonyms;
    }

    public void setTitleSynonyms(List<Object> titleSynonyms) {
        this.titleSynonyms = titleSynonyms;
    }

    @Bindable
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

        notifyPropertyChanged(BR.type);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getAiring() {
        return airing;
    }

    public void setAiring(Boolean airing) {
        this.airing = airing;
    }

    public Aired getAired() {
        return aired;
    }

    public void setAired(Aired aired) {
        this.aired = aired;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Bindable
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;

        notifyPropertyChanged(BR.rating);
    }

    @Bindable
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
        notifyPropertyChanged(BR.score);
    }

    public Integer getScoredBy() {
        return scoredBy;
    }

    public void setScoredBy(Integer scoredBy) {
        this.scoredBy = scoredBy;
    }


    @Bindable
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }


    @Bindable
    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    @Bindable
    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    @Bindable
    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;

        notifyPropertyChanged(BR.synopsis);
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    @Bindable
    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;

        notifyPropertyChanged(BR.producers);
    }

    public List<Licensor> getLicensors() {
        return licensors;
    }

    public void setLicensors(List<Licensor> licensors) {
        this.licensors = licensors;
    }

    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Object> getExplicitGenres() {
        return explicitGenres;
    }

    public void setExplicitGenres(List<Object> explicitGenres) {
        this.explicitGenres = explicitGenres;
    }

    public List<Object> getThemes() {
        return themes;
    }

    public void setThemes(List<Object> themes) {
        this.themes = themes;
    }

    public List<Object> getDemographics() {
        return demographics;
    }

    public void setDemographics(List<Object> demographics) {
        this.demographics = demographics;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(titleJapanese);
        dest.writeValue(rating);
        dest.writeValue(images);
        dest.writeValue(synopsis);
        dest.writeValue(producers);
        dest.writeValue(type);
        dest.writeValue(popularity);
        dest.writeValue(rank);
        dest.writeValue(score);

    }

    public Datum() {
    }


}

class Aired {

    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("prop")
    @Expose
    private Prop prop;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Prop getProp() {
        return prop;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }

}
class Broadcast {

    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("string")
    @Expose
    private String string;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}

class Data {

    @SerializedName("data")
    @Expose
    private List<Datum> data;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
class Demographic {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

class ExplicitGenre {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

class Genre {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

class Images {

    @SerializedName("jpg")
    @Expose
    private Jpg jpg;
    @SerializedName("webp")
    @Expose
    private Webp webp;

    public Jpg getJpg() {
        return jpg;
    }

    public void setJpg(Jpg jpg) {
        this.jpg = jpg;
    }

    public Webp getWebp() {
        return webp;
    }

    public void setWebp(Webp webp) {
        this.webp = webp;
    }

}

class Items {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

}

class Jpg {

    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("small_image_url")
    @Expose
    private String smallImageUrl;
    @SerializedName("large_image_url")
    @Expose
    private String largeImageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

}

class Licensor {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

class Pagination {

    @SerializedName("last_visible_page")
    @Expose
    private Integer lastVisiblePage;
    @SerializedName("has_next_page")
    @Expose
    private Boolean hasNextPage;
    @SerializedName("items")
    @Expose
    private Items items;

    public Integer getLastVisiblePage() {
        return lastVisiblePage;
    }

    public void setLastVisiblePage(Integer lastVisiblePage) {
        this.lastVisiblePage = lastVisiblePage;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

}

class Producer {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

class Prop {


}

class Studio {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}


class Theme {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

class Title {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

class Trailer {

    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

}



class Webp {

    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("small_image_url")
    @Expose
    private String smallImageUrl;
    @SerializedName("large_image_url")
    @Expose
    private String largeImageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

}






