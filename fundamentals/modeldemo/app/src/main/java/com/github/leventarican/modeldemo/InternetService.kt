package com.github.leventarican.modeldemo

import android.os.AsyncTask
import org.jsoup.Jsoup
import org.jsoup.nodes.Document


class InternetService {

    private val url = "https://example.com"
    private lateinit var times: MutableList<String>

    fun connect(): InternetService {
        val doc = Connector().execute(url).get()
        val h1 = doc.select("h1")
        times = mutableListOf()
        h1.forEach {
            times.add(it.text())
        }
        return this
    }

    fun getTimes(): MutableList<String> {
        return times
    }
}

/*
 * network call! we wont do that in main/ui thread.
 * Caused by: android.os.NetworkOnMainThreadException
 *
 * for https we need a certification
 * Caused by: java.security.cert.CertificateException
 */
class Connector : AsyncTask<String, Int, Document>() {
    override fun doInBackground(vararg params: String?): Document {
        return Jsoup.connect(params[0]).get()
    }
}