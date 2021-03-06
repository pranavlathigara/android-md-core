package me.henrytao.mddemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.henrytao.mddemo.R;
import me.henrytao.mddemo.fragment.ExampleCardViewFragment;
import me.henrytao.mddemo.fragment.ExampleMdButtonFragment;
import me.henrytao.mddemo.fragment.ExampleMdEditTextFragment;
import me.henrytao.mddemo.fragment.ExampleMdListFragment;
import me.henrytao.mddemo.fragment.InfoFragment;

public class MainActivity extends AppCompatActivity {

  @Bind(R.id.toolbar)
  Toolbar vToolbar;

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.action_info:
        startActivity(SimpleActivity.newIntent(this, InfoFragment.class, getString(R.string.text_about)));
        return true;
    }
    return super.onOptionsItemSelected(item);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    setSupportActionBar(vToolbar);
  }

  @OnClick(R.id.goto_button)
  protected void onGotoButtonClick() {
    startActivity(SimpleActivity.newIntent(this, ExampleMdButtonFragment.class, "Button"));
  }

  @OnClick(R.id.goto_edit_text)
  protected void onGotoEditTextClick() {
    startActivity(SimpleActivity.newIntent(this, ExampleMdEditTextFragment.class, "EditText"));
  }

  @OnClick(R.id.goto_list_view)
  protected void onGotoListViewClick() {
    startActivity(SimpleActivity.newIntent(this, ExampleMdListFragment.class, "ListView"));
  }

  @OnClick(R.id.goto_textview)
  protected void onGotoTextViewClick() {
    startActivity(TypoActivity.newIntent(this));
  }

  @OnClick(R.id.goto_theme)
  protected void onGotoThemeClick() {
    startActivity(ThemeActivity.newIntent(this));
  }

  @OnClick(R.id.goto_card_view)
  protected void onGototCardViewClick() {
    startActivity(SimpleActivity.newIntent(this, ExampleCardViewFragment.class, "CardView"));
  }
}
