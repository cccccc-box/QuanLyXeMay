/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.utils;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author Just Share
 */
public class Image {
    public static java.awt.Image getAppIcon() {
        URL url = Image.class.getResource("/com/mycompany/icon/helmet.png");
        return new ImageIcon(url).getImage();
    }

    public static boolean save(File src) {
        File dst = new File("src\\main\\resources\\com\\mycompany\\anhthe", src.getName());
        if (!dst.getParentFile().exists()/*kiểm tra thư mục có tồn tại*/) {
            dst.getParentFile().mkdirs();//tạo thư mục
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("src\\main\\resources\\com\\mycompany\\anhthe", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
