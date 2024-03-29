package com.example.week3weekendapi.model.repos

import com.google.gson.annotations.SerializedName

class Repository {

    @SerializedName("stargazers_count")
    var stargazersCount: Int = 0

    @SerializedName("pushed_at")
    var pushedAt: String? = null

    @SerializedName("subscription_url")
    var subscriptionUrl: String? = null

    @SerializedName("language")
    var language: String? = null

    @SerializedName("branches_url")
    var branchesUrl: String? = null

    @SerializedName("issue_comment_url")
    var issueCommentUrl: String? = null

    @SerializedName("labels_url")
    var labelsUrl: String? = null

    @SerializedName("subscribers_url")
    var subscribersUrl: String? = null

    @SerializedName("releases_url")
    var releasesUrl: String? = null

    @SerializedName("svn_url")
    var svnUrl: String? = null

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("forks")
    var forks: Int = 0

    @SerializedName("archive_url")
    var archiveUrl: String? = null

    @SerializedName("git_refs_url")
    var gitRefsUrl: String? = null

    @SerializedName("forks_url")
    var forksUrl: String? = null

    @SerializedName("statuses_url")
    var statusesUrl: String? = null

    @SerializedName("ssh_url")
    var sshUrl: String? = null

    @SerializedName("license")
    var license: Any? = null

    @SerializedName("full_name")
    var fullName: String? = null

    @SerializedName("size")
    var size: Int = 0

    @SerializedName("languages_url")
    var languagesUrl: String? = null

    @SerializedName("html_url")
    var htmlUrl: String? = null

    @SerializedName("collaborators_url")
    var collaboratorsUrl: String? = null

    @SerializedName("clone_url")
    var cloneUrl: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("pulls_url")
    var pullsUrl: String? = null

    @SerializedName("default_branch")
    var defaultBranch: String? = null

    @SerializedName("hooks_url")
    var hooksUrl: String? = null

    @SerializedName("trees_url")
    var treesUrl: String? = null

    @SerializedName("tags_url")
    var tagsUrl: String? = null

    @SerializedName("private")
    var isJsonMemberPrivate: Boolean = false

    @SerializedName("contributors_url")
    var contributorsUrl: String? = null

    @SerializedName("has_downloads")
    var isHasDownloads: Boolean = false

    @SerializedName("notifications_url")
    var notificationsUrl: String? = null

    @SerializedName("open_issues_count")
    var openIssuesCount: Int = 0

    @SerializedName("description")
    var description: Any? = null

    @SerializedName("created_at")
    var createdAt: String? = null

    @SerializedName("watchers")
    var watchers: Int = 0

    @SerializedName("keys_url")
    var keysUrl: String? = null

    @SerializedName("deployments_url")
    var deploymentsUrl: String? = null

    @SerializedName("has_projects")
    var isHasProjects: Boolean = false

    @SerializedName("archived")
    var isArchived: Boolean = false

    @SerializedName("has_wiki")
    var isHasWiki: Boolean = false

    @SerializedName("updated_at")
    var updatedAt: String? = null

    @SerializedName("comments_url")
    var commentsUrl: String? = null

    @SerializedName("stargazers_url")
    var stargazersUrl: String? = null

    @SerializedName("disabled")
    var isDisabled: Boolean = false

    @SerializedName("git_url")
    var gitUrl: String? = null

    @SerializedName("has_pages")
    var isHasPages: Boolean = false

    @SerializedName("owner")
    var owner: Owner? = null

    @SerializedName("commits_url")
    var commitsUrl: String? = null

    @SerializedName("compare_url")
    var compareUrl: String? = null

    @SerializedName("git_commits_url")
    var gitCommitsUrl: String? = null

    @SerializedName("blobs_url")
    var blobsUrl: String? = null

    @SerializedName("git_tags_url")
    var gitTagsUrl: String? = null

    @SerializedName("merges_url")
    var mergesUrl: String? = null

    @SerializedName("downloads_url")
    var downloadsUrl: String? = null

    @SerializedName("has_issues")
    var isHasIssues: Boolean = false

    @SerializedName("url")
    var url: String? = null

    @SerializedName("contents_url")
    var contentsUrl: String? = null

    @SerializedName("mirror_url")
    var mirrorUrl: Any? = null

    @SerializedName("milestones_url")
    var milestonesUrl: String? = null

    @SerializedName("teams_url")
    var teamsUrl: String? = null

    @SerializedName("fork")
    var isFork: Boolean = false

    @SerializedName("issues_url")
    var issuesUrl: String? = null

    @SerializedName("events_url")
    var eventsUrl: String? = null

    @SerializedName("issue_events_url")
    var issueEventsUrl: String? = null

    @SerializedName("assignees_url")
    var assigneesUrl: String? = null

    @SerializedName("open_issues")
    var openIssues: Int = 0

    @SerializedName("watchers_count")
    var watchersCount: Int = 0

    @SerializedName("node_id")
    var nodeId: String? = null

    @SerializedName("homepage")
    var homepage: Any? = null

    @SerializedName("forks_count")
    var forksCount: Int = 0

}