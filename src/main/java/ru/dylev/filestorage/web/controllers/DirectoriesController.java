package ru.dylev.filestorage.web.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.dylev.filestorage.dto.validation.ValidDirectoryName;
import ru.dylev.filestorage.service.DirectoryService;
import ru.dylev.filestorage.util.ControllerUtil;

import java.util.List;

/**
 * Handles directories manipulation requests.
 */
@Controller
@Validated
@RequestMapping("/directories")
@RequiredArgsConstructor
public class DirectoriesController {

    private final DirectoryService directoryService;

    /**
     * Method handles requests for creation of new directory.
     * @param path path where new directory should be created.
     * @param newDirectoryName name of the new directory.
     * @param redirectAttributes {@link RedirectAttributes}.
     * @return redirect to update viewed file list.
     */
    @PostMapping(value = "create")
    public String createDirectory(@RequestParam(value = "path") String path,
                                  @RequestParam(value = "newDirectoryName") @ValidDirectoryName String newDirectoryName,
                                  RedirectAttributes redirectAttributes) {

        redirectAttributes.addAttribute("path", path);
        directoryService.createDirectory(path, newDirectoryName);

        return "redirect:/updateFilesList";
    }

    /**
     * Method handles requests for directory renaming.
     * @param path path where directory to be renamed is located.
     * @param newName new name of the directory.
     * @param redirectAttributes {@link RedirectAttributes}.
     * @return redirect to update viewed file list.
     */
    @PostMapping(value = "rename")
    public String renameDirectory(@RequestParam(value = "path") String path,
                                  @RequestParam(value = "oldName") String oldName,
                                  @RequestParam(value = "newName") String newName,
                                  RedirectAttributes redirectAttributes) {

        directoryService.renameDirectory(path, oldName, newName);
        redirectAttributes.addAttribute("path", path);

        return "redirect:/updateFilesList";
    }

    /**
     * Method handles directory deletion requests.
     * @param path path where directory to be deleted is located.
     * @param name of the directory to be deleted.
     * @param redirectAttributes {@link RedirectAttributes}.
     * @return redirect to update viewed file list.
     */
    @PostMapping(value = "delete")
    public String deleteDirectory(@RequestParam(value = "path") String path,
                                  @RequestParam(value = "name") String name,
                                  RedirectAttributes redirectAttributes) {

        directoryService.deleteDirectory(path, name);
        redirectAttributes.addAttribute("path", path);

        return "redirect:/updateFilesList";
    }
}
