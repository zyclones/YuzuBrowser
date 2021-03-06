package jp.hazuki.yuzubrowser.userjs

import android.os.Bundle
import android.view.MenuItem

import jp.hazuki.yuzubrowser.R
import jp.hazuki.yuzubrowser.utils.app.ThemeActivity

class UserScriptListActivity : ThemeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_base)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportFragmentManager.beginTransaction()
                .replace(R.id.container, UserScriptListFragment())
                .commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
