module es.ieslosmontecillos.di_t8a1_testfx_gallegomario {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testfx.junit5;
    requires org.testfx;
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;
    requires org.hamcrest;
    requires org.assertj.core;
    requires org.junit.platform.commons;
    requires org.junit.platform.engine;
    requires org.junit.platform.launcher;

    opens es.ieslosmontecillos.di_t8a1_testfx_gallegomario to javafx.fxml, org.junit.platform.commons, org.testfx.junit5;
    exports es.ieslosmontecillos.di_t8a1_testfx_gallegomario;

}