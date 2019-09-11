package com.example.week3weekendapi

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import android.os.Bundle
import com.example.week3weekendapi.model.datasource.remote.retrofit.GithubService
import com.example.week3weekendapi.model.repos.Repository
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_repo_list.*

class RepoListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repo_list)
        initRecyclerView()
    }

    fun initRecyclerView(){
        GithubService.createService().getRepos()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<List<Repository>>{
                    lateinit var repositories: List<Repository>
                    override fun onComplete() { onResult(repositories) }

                    override fun onSubscribe(d: Disposable) {}

                    override fun onNext(t: List<Repository>) { repositories = t}

                    override fun onError(e: Throwable) {}

                })
    }

    fun onResult(repositories: List<Repository>){
        val adapter = RepoListAdapter(repositories)
        rvRepoList.layoutManager = LinearLayoutManager(this)
        rvRepoList.adapter = adapter
    }

}
