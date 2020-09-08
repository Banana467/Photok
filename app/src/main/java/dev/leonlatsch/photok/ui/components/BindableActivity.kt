package dev.leonlatsch.photok.ui.components

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BindableActivity<BindingType : ViewDataBinding>(
    @LayoutRes private val layout: Int
) : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: BindingType = DataBindingUtil.setContentView(this, layout)
        bind(binding)
    }

    open fun bind(binding: BindingType) {
    }
}