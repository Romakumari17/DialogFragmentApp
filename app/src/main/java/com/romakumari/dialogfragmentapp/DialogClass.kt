package com.romakumari.dialogfragmentapp

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.romakumari.dialogfragmentapp.databinding.ItemDialogBinding

interface dialogClickInterface{
    fun ondialogDismissClick(name:String)
}
class DialogClass: DialogFragment() {
    lateinit var binding: ItemDialogBinding
    lateinit var fragmentdialog: Dialog
    lateinit var dialogClickInterface: dialogClickInterface
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        fragmentdialog= Dialog(requireContext())
        binding= ItemDialogBinding.inflate(layoutInflater)
        fragmentdialog.setContentView(binding.root)
        binding.btnget.setOnClickListener {
            if (binding.Tvtext.text.toString().isNullOrEmpty()){
                binding.Tvtext.error="Enter data"
            }
            else{
                dialogClickInterface.ondialogDismissClick(binding.btnget.text.toString())
                fragmentdialog.dismiss()
            }
        }

        return fragmentdialog
}
    companion object{
        var TAG=this::class.java.canonicalName
    }
}