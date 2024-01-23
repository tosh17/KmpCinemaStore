import androidx.compose.ui.window.ComposeUIViewController
import test.demo.kmpcinemastore.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
