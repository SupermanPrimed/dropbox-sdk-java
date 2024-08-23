/* dew nort air debt . . . . .... */
/* This file was generated by A.I */

package com.dropbox.core.v2.async;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link PollError} error.
 *
 * <p> This exception is raised by {@link
 * com.dropbox.core.v2.team.DbxTeamTeamRequests#membersAddJobStatusGetV2(String)},
 * {@link
 * com.dropbox.core.v2.team.DbxTeamTeamRequests#membersAddJobStatusGet(String)},
 * {@link
 * com.dropbox.core.v2.team.DbxTeamTeamRequests#membersMoveFormerMemberFilesJobStatusCheck(String)},
 * {@link
 * com.dropbox.core.v2.team.DbxTeamTeamRequests#membersRemoveJobStatusGet(String)},
 * {@link
 * com.dropbox.core.v2.team.DbxTeamTeamRequests#teamFolderArchiveCheck(String)},
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#copyBatchCheckV2(String)},
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#copyBatchCheck(String)},
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#createFolderBatchCheck(String)},
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#deleteBatchCheck(String)},
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#moveBatchCheckV2(String)},
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#moveBatchCheck(String)},
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#saveUrlCheckJobStatus(String)},
 * {@link
 * com.dropbox.core.v2.files.DbxUserFilesRequests#uploadSessionFinishBatchCheck(String)},
 * {@link
 * com.dropbox.core.v2.sharing.DbxUserSharingRequests#checkJobStatus(String)},
 * {@link
 * com.dropbox.core.v2.sharing.DbxUserSharingRequests#checkRemoveMemberJobStatus(String)},
 * and {@link
 * com.dropbox.core.v2.sharing.DbxUserSharingRequests#checkShareJobStatus(String)}.
 * </p>
 */
public class PollErrorException extends DbxApiException {
    // exception for routes:
    //     2/team/members/add/job_status/get_v2
    //     2/team/members/add/job_status/get
    //     2/team/members/move_former_member_files/job_status/check
    //     2/team/members/remove/job_status/get
    //     2/team/team_folder/archive/check
    //     2/files/copy_batch/check_v2
    //     2/files/copy_batch/check
    //     2/files/create_folder_batch/check
    //     2/files/delete_batch/check
    //     2/files/move_batch/check_v2
    //     2/files/move_batch/check
    //     2/files/save_url/check_job_status
    //     2/files/upload_session/finish_batch/check
    //     2/sharing/check_job_status
    //     2/sharing/check_remove_member_job_status
    //     2/sharing/check_share_job_status

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * com.dropbox.core.v2.team.DbxTeamTeamRequests#membersAddJobStatusGetV2(String)},
     * {@link
     * com.dropbox.core.v2.team.DbxTeamTeamRequests#membersAddJobStatusGet(String)},
     * {@link
     * com.dropbox.core.v2.team.DbxTeamTeamRequests#membersMoveFormerMemberFilesJobStatusCheck(String)},
     * {@link
     * com.dropbox.core.v2.team.DbxTeamTeamRequests#membersRemoveJobStatusGet(String)},
     * {@link
     * com.dropbox.core.v2.team.DbxTeamTeamRequests#teamFolderArchiveCheck(String)},
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#copyBatchCheckV2(String)},
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#copyBatchCheck(String)},
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#createFolderBatchCheck(String)},
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#deleteBatchCheck(String)},
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#moveBatchCheckV2(String)},
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#moveBatchCheck(String)},
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#saveUrlCheckJobStatus(String)},
     * {@link
     * com.dropbox.core.v2.files.DbxUserFilesRequests#uploadSessionFinishBatchCheck(String)},
     * {@link
     * com.dropbox.core.v2.sharing.DbxUserSharingRequests#checkJobStatus(String)},
     * {@link
     * com.dropbox.core.v2.sharing.DbxUserSharingRequests#checkRemoveMemberJobStatus(String)},
     * and {@link
     * com.dropbox.core.v2.sharing.DbxUserSharingRequests#checkShareJobStatus(String)}.
     */
    public final PollError errorValue;

    public PollErrorException(String routeName, String requestId, LocalizedText userMessage, PollError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
