package com.example.week3weekendapi.model.repos

import com.google.gson.annotations.SerializedName

class Owner {

    @SerializedName("gists_url")
    var gistsUrl: String? = null

    @SerializedName("repos_url")
    var reposUrl: String? = null

    @SerializedName("following_url")
    var followingUrl: String? = null

    @SerializedName("starred_url")
    var starredUrl: String? = null

    @SerializedName("login")
    var login: String? = null

    @SerializedName("followers_url")
    var followersUrl: String? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("url")
    var url: String? = null

    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String? = null

    @SerializedName("received_events_url")
    var receivedEventsUrl: String? = null

    @SerializedName("avatar_url")
    var avatarUrl: String? = null

    @SerializedName("events_url")
    var eventsUrl: String? = null

    @SerializedName("html_url")
    var htmlUrl: String? = null

    @SerializedName("site_admin")
    var isSiteAdmin: Boolean = false

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("gravatar_id")
    var gravatarId: String? = null

    @SerializedName("node_id")
    var nodeId: String? = null

    @SerializedName("organizations_url")
    var organizationsUrl: String? = null

}