package com.example.week3weekendapi.model.profile

import com.google.gson.annotations.SerializedName

class Profile {

    @SerializedName("gists_url")
    var gistsUrl: String? = null

    @SerializedName("repos_url")
    var reposUrl: String? = null

    @SerializedName("following_url")
    var followingUrl: String? = null

    @SerializedName("bio")
    var bio: String? = null

    @SerializedName("created_at")
    var createdAt: String? = null

    @SerializedName("login")
    var login: String? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("blog")
    var blog: String? = null

    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String? = null

    @SerializedName("updated_at")
    var updatedAt: String? = null

    @SerializedName("site_admin")
    var isSiteAdmin: Boolean = false

    @SerializedName("company")
    var company: String? = null

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("public_repos")
    var publicRepos: Int = 0

    @SerializedName("gravatar_id")
    var gravatarId: String? = null

    @SerializedName("email")
    var email: Any? = null

    @SerializedName("organizations_url")
    var organizationsUrl: String? = null

    @SerializedName("hireable")
    var hireable: Any? = null

    @SerializedName("starred_url")
    var starredUrl: String? = null

    @SerializedName("followers_url")
    var followersUrl: String? = null

    @SerializedName("public_gists")
    var publicGists: Int = 0

    @SerializedName("url")
    var url: String? = null

    @SerializedName("received_events_url")
    var receivedEventsUrl: String? = null

    @SerializedName("followers")
    var followers: Int = 0

    @SerializedName("avatar_url")
    var avatarUrl: String? = null

    @SerializedName("events_url")
    var eventsUrl: String? = null

    @SerializedName("html_url")
    var htmlUrl: String? = null

    @SerializedName("following")
    var following: Int = 0

    @SerializedName("name")
    var name: String? = null

    @SerializedName("location")
    var location: String? = null

    @SerializedName("node_id")
    var nodeId: String? = null

}