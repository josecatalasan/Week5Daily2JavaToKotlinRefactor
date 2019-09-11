package com.example.week3weekendapi

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.week3weekendapi.model.datasource.remote.retrofit.GithubService
import com.example.week3weekendapi.model.profile.Profile
import com.squareup.picasso.Picasso
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fillViewsWithAPICall()

        fabRepoList!!.setOnClickListener { view ->
            val intent = Intent(view.context, RepoListActivity::class.java)
            startActivity(intent)
        }
    }

    fun fillViewsWithAPICall(){
        GithubService.createService().getProfile()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<Profile>{
                    lateinit var profile : Profile

                    override fun onComplete() { onResult(profile) }

                    override fun onSubscribe(d: Disposable) {}

                    override fun onNext(t: Profile) { profile = t }

                    override fun onError(e: Throwable) {}
                })

    }

    fun onResult(profile : Profile){
        tvName.text = profile.name
        tvCompany.text = profile.company
        tvBio.text = profile.bio
        tvId.text = profile.id.toString()
        tvLogin.text = profile.login
        tvGitUrl.text = profile.htmlUrl
        Picasso.get().load(profile.avatarUrl).into(ivAvatar)
    }

}
