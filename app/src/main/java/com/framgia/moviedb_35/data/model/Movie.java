package com.framgia.moviedb_35.data.model;

import com.framgia.moviedb_35.data.model.Company;
import com.framgia.moviedb_35.data.model.Genre;
import com.framgia.moviedb_35.data.model.Language;
import com.framgia.moviedb_35.data.source.remote.response.CastResult;
import com.framgia.moviedb_35.data.source.remote.response.VideoResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {
    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("backdrop_path")
    @Expose
    private String mBackdropPath;

    @SerializedName("genres")
    @Expose
    private List<Genre> mGenres;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("overview")
    @Expose
    private String mOverview;

    @SerializedName("poster_path")
    @Expose
    private String mPosterPath;

    @SerializedName("production_companies")
    @Expose
    private List<Company> mProductionCompanies;

    @SerializedName("release_date")
    @Expose
    private String mReleaseDate;

    @SerializedName("runtime")
    @Expose
    private int mRuntime;

    @SerializedName("spoken_languages")
    @Expose
    private List<Language> mSpokenLanguages;

    @SerializedName("vote_average")
    @Expose
    private float mVoteAverage;

    @SerializedName("videos")
    @Expose
    private VideoResult mVideoResult;

    @SerializedName("credits")
    @Expose
    private CastResult mCastResult;

    public Movie() {
    }

    public Movie(int id, String title, String posterPath, float voteAverage) {
        mId = id;
        mTitle = title;
        mPosterPath = posterPath;
        mVoteAverage = voteAverage;
    }

    public int getId() {
        return mId;
    }

    public Movie setId(int id) {
        mId = id;
        return this;
    }

    public String getBackdropPath() {
        return mBackdropPath;
    }

    public Movie setBackdropPath(String backdropPath) {
        mBackdropPath = backdropPath;
        return this;
    }

    public List<Genre> getGenres() {
        return mGenres;
    }

    public Movie setGenres(List<Genre> genres) {
        mGenres = genres;
        return this;
    }

    public String getTitle() {
        return mTitle;
    }

    public Movie setTitle(String title) {
        mTitle = title;
        return this;
    }

    public String getOverview() {
        return mOverview;
    }

    public Movie setOverview(String overview) {
        mOverview = overview;
        return this;
    }

    public String getPosterPath() {
        return mPosterPath;
    }

    public Movie setPosterPath(String posterPath) {
        mPosterPath = posterPath;
        return this;
    }

    public List<Company> getProductionCompanies() {
        return mProductionCompanies;
    }

    public Movie setProductionCompanies(List<Company> productionCompanies) {
        mProductionCompanies = productionCompanies;
        return this;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public Movie setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
        return this;
    }

    public int getRuntime() {
        return mRuntime;
    }

    public Movie setRuntime(int runtime) {
        mRuntime = runtime;
        return this;
    }

    public List<Language> getSpokenLanguages() {
        return mSpokenLanguages;
    }

    public Movie setSpokenLanguages(List<Language> spokenLanguages) {
        mSpokenLanguages = spokenLanguages;
        return this;
    }

    public float getVoteAverage() {
        return mVoteAverage;
    }

    public Movie setVoteAverage(float voteAverage) {
        mVoteAverage = voteAverage;
        return this;
    }

    public VideoResult getVideoResult() {
        return mVideoResult;
    }

    public Movie setVideoResult(VideoResult videoResult) {
        mVideoResult = videoResult;
        return this;
    }

    public CastResult getCastResult() {
        return mCastResult;
    }

    public Movie setCastResult(CastResult castResult) {
        mCastResult = castResult;
        return this;
    }

    public float calculateVoteRating() {
        return mVoteAverage / 2;
    }
}
