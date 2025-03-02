import ja.burhanrashid52.photoeditor.PhotoEditor;
import ja.burhanrashid52.photoeditor.PhotoEditorView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhotoEditorView photoEditorView = findViewById(R.id.photoEditorView);
        PhotoEditor photoEditor = new PhotoEditor.Builder(this, photoEditorView).build();

        findViewById(R.id.btn_edit).setOnClickListener(v -> {
            photoEditor.addText("Hello", getResources().getColor(android.R.color.holo_blue_light));
        });
    }
}
