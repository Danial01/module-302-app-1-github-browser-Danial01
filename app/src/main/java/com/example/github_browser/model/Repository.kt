package com.example.github_browser.model

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import com.google.gson.annotations.SerializedName

@VersionedParcelize
data class Repository(
    @SerializedName("archive_url")
    val archiveUrl: String? = "",
    @SerializedName("archived")
    val archived: Boolean? = false,
    @SerializedName("assignees_url")
    val assigneesUrl: String? = "",
    @SerializedName("blobs_url")
    val blobsUrl: String? = "",
    @SerializedName("branches_url")
    val branchesUrl: String? = "",
    @SerializedName("clone_url")
    val cloneUrl: String? = "",
    @SerializedName("collaborators_url")
    val collaboratorsUrl: String? = "",
    @SerializedName("comments_url")
    val commentsUrl: String? = "",
    @SerializedName("commits_url")
    val commitsUrl: String? = "",
    @SerializedName("compare_url")
    val compareUrl: String? = "",
    @SerializedName("contents_url")
    val contentsUrl: String? = "",
    @SerializedName("contributors_url")
    val contributorsUrl: String? = "",
    @SerializedName("created_at")
    val createdAt: String? = "",
    @SerializedName("default_branch")
    val defaultBranch: String? = "",
    @SerializedName("deployments_url")
    val deploymentsUrl: String? = "",
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("disabled")
    val disabled: Boolean? = false,
    @SerializedName("downloads_url")
    val downloadsUrl: String? = "",
    @SerializedName("events_url")
    val eventsUrl: String? = "",
    @SerializedName("fork")
    val fork: Boolean? = false,
    @SerializedName("forks")
    val forks: Int? = 0,
    @SerializedName("forks_count")
    val forksCount: Int? = 0,
    @SerializedName("forks_url")
    val forksUrl: String? = "",
    @SerializedName("full_name")
    val fullName: String? = "",
    @SerializedName("git_commits_url")
    val gitCommitsUrl: String? = "",
    @SerializedName("git_refs_url")
    val gitRefsUrl: String? = "",
    @SerializedName("git_tags_url")
    val gitTagsUrl: String? = "",
    @SerializedName("git_url")
    val gitUrl: String? = "",
    @SerializedName("has_downloads")
    val hasDownloads: Boolean? = false,
    @SerializedName("has_issues")
    val hasIssues: Boolean? = false,
    @SerializedName("has_pages")
    val hasPages: Boolean? = false,
    @SerializedName("has_projects")
    val hasProjects: Boolean? = false,
    @SerializedName("has_wiki")
    val hasWiki: Boolean? = false,
    @SerializedName("homepage")
    val homepage: String? = "",
    @SerializedName("hooks_url")
    val hooksUrl: String? = "",
    @SerializedName("html_url")
    val htmlUrl: String? = "",
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("issue_comment_url")
    val issueCommentUrl: String? = "",
    @SerializedName("issue_events_url")
    val issueEventsUrl: String? = "",
    @SerializedName("issues_url")
    val issuesUrl: String? = "",
    @SerializedName("keys_url")
    val keysUrl: String? = "",
    @SerializedName("labels_url")
    val labelsUrl: String? = "",
    @SerializedName("language")
    val language: String? = "",
    @SerializedName("languages_url")
    val languagesUrl: String? = "",
    @SerializedName("license")
    val license: License? = License(),
    @SerializedName("merges_url")
    val mergesUrl: String? = "",
    @SerializedName("milestones_url")
    val milestonesUrl: String? = "",
    @SerializedName("mirror_url")
    val mirrorUrl: Any? = Any(),
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("node_id")
    val nodeId: String? = "",
    @SerializedName("notifications_url")
    val notificationsUrl: String? = "",
    @SerializedName("open_issues")
    val openIssues: Int? = 0,
    @SerializedName("open_issues_count")
    val openIssuesCount: Int? = 0,
    @SerializedName("owner")
    val owner: Owner? = Owner(),
    @SerializedName("private")
    val `private`: Boolean? = false,
    @SerializedName("pulls_url")
    val pullsUrl: String? = "",
    @SerializedName("pushed_at")
    val pushedAt: String? = "",
    @SerializedName("releases_url")
    val releasesUrl: String? = "",
    @SerializedName("size")
    val size: Int? = 0,
    @SerializedName("ssh_url")
    val sshUrl: String? = "",
    @SerializedName("stargazers_count")
    val stargazersCount: Int? = 0,
    @SerializedName("stargazers_url")
    val stargazersUrl: String? = "",
    @SerializedName("statuses_url")
    val statusesUrl: String? = "",
    @SerializedName("subscribers_url")
    val subscribersUrl: String? = "",
    @SerializedName("subscription_url")
    val subscriptionUrl: String? = "",
    @SerializedName("svn_url")
    val svnUrl: String? = "",
    @SerializedName("tags_url")
    val tagsUrl: String? = "",
    @SerializedName("teams_url")
    val teamsUrl: String? = "",
    @SerializedName("trees_url")
    val treesUrl: String? = "",
    @SerializedName("updated_at")
    val updatedAt: String? = "",
    @SerializedName("url")
    val url: String? = "",
    @SerializedName("watchers")
    val watchers: Int? = 0,
    @SerializedName("watchers_count")
    val watchersCount: Int? = 0
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        TODO("license"),
        parcel.readString(),
        parcel.readString(),
        TODO("mirrorUrl"),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        TODO("owner"),
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(archiveUrl)
        parcel.writeValue(archived)
        parcel.writeString(assigneesUrl)
        parcel.writeString(blobsUrl)
        parcel.writeString(branchesUrl)
        parcel.writeString(cloneUrl)
        parcel.writeString(collaboratorsUrl)
        parcel.writeString(commentsUrl)
        parcel.writeString(commitsUrl)
        parcel.writeString(compareUrl)
        parcel.writeString(contentsUrl)
        parcel.writeString(contributorsUrl)
        parcel.writeString(createdAt)
        parcel.writeString(defaultBranch)
        parcel.writeString(deploymentsUrl)
        parcel.writeString(description)
        parcel.writeValue(disabled)
        parcel.writeString(downloadsUrl)
        parcel.writeString(eventsUrl)
        parcel.writeValue(fork)
        parcel.writeValue(forks)
        parcel.writeValue(forksCount)
        parcel.writeString(forksUrl)
        parcel.writeString(fullName)
        parcel.writeString(gitCommitsUrl)
        parcel.writeString(gitRefsUrl)
        parcel.writeString(gitTagsUrl)
        parcel.writeString(gitUrl)
        parcel.writeValue(hasDownloads)
        parcel.writeValue(hasIssues)
        parcel.writeValue(hasPages)
        parcel.writeValue(hasProjects)
        parcel.writeValue(hasWiki)
        parcel.writeString(homepage)
        parcel.writeString(hooksUrl)
        parcel.writeString(htmlUrl)
        parcel.writeValue(id)
        parcel.writeString(issueCommentUrl)
        parcel.writeString(issueEventsUrl)
        parcel.writeString(issuesUrl)
        parcel.writeString(keysUrl)
        parcel.writeString(labelsUrl)
        parcel.writeString(language)
        parcel.writeString(languagesUrl)
        parcel.writeString(mergesUrl)
        parcel.writeString(milestonesUrl)
        parcel.writeString(name)
        parcel.writeString(nodeId)
        parcel.writeString(notificationsUrl)
        parcel.writeValue(openIssues)
        parcel.writeValue(openIssuesCount)
        parcel.writeValue(private)
        parcel.writeString(pullsUrl)
        parcel.writeString(pushedAt)
        parcel.writeString(releasesUrl)
        parcel.writeValue(size)
        parcel.writeString(sshUrl)
        parcel.writeValue(stargazersCount)
        parcel.writeString(stargazersUrl)
        parcel.writeString(statusesUrl)
        parcel.writeString(subscribersUrl)
        parcel.writeString(subscriptionUrl)
        parcel.writeString(svnUrl)
        parcel.writeString(tagsUrl)
        parcel.writeString(teamsUrl)
        parcel.writeString(treesUrl)
        parcel.writeString(updatedAt)
        parcel.writeString(url)
        parcel.writeValue(watchers)
        parcel.writeValue(watchersCount)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Repository> {
        override fun createFromParcel(parcel: Parcel): Repository {
            return Repository(parcel)
        }

        override fun newArray(size: Int): Array<Repository?> {
            return arrayOfNulls(size)
        }
    }
}