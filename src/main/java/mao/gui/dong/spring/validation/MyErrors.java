package mao.gui.dong.spring.validation;

import org.springframework.beans.factory.support.BeanDefinitionValidationException;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.List;

public class MyErrors implements Errors {
    /**
     * Return the name of the bound root object.
     */
    @Override
    public String getObjectName() {
        return null;
    }

    /**
     * Allow context to be changed so that standard validators can validate
     * subtrees. Reject calls prepend the given path to the field names.
     * <p>For example, an address validator could validate the subobject
     * "address" of a customer object.
     *
     * @param nestedPath nested path within this object,
     *                   e.g. "address" (defaults to "", {@code null} is also acceptable).
     *                   Can end with a dot: both "address" and "address." are valid.
     */
    @Override
    public void setNestedPath(String nestedPath) {

    }

    /**
     * Return the current nested path of this {@link Errors} object.
     * <p>Returns a nested path with a dot, i.e. "address.", for easy
     * building of concatenated paths. Default is an empty String.
     */
    @Override
    public String getNestedPath() {
        return null;
    }

    /**
     * Push the given sub path onto the nested path stack.
     * <p>A {@link #popNestedPath()} call will reset the original
     * nested path before the corresponding
     * {@code pushNestedPath(String)} call.
     * <p>Using the nested path stack allows to set temporary nested paths
     * for subobjects without having to worry about a temporary path holder.
     * <p>For example: current path "spouse.", pushNestedPath("child") ->
     * result path "spouse.child."; popNestedPath() -> "spouse." again.
     *
     * @param subPath the sub path to push onto the nested path stack
     * @see #popNestedPath
     */
    @Override
    public void pushNestedPath(String subPath) {

    }

    /**
     * Pop the former nested path from the nested path stack.
     *
     * @throws IllegalStateException if there is no former nested path on the stack
     * @see #pushNestedPath
     */
    @Override
    public void popNestedPath() throws IllegalStateException {

    }

    /**
     * Register a global error for the entire target object,
     * using the given error description.
     *
     * @param errorCode error code, interpretable as a message key
     */
    @Override
    public void reject(String errorCode) {

    }

    /**
     * Register a global error for the entire target object,
     * using the given error description.
     *
     * @param errorCode      error code, interpretable as a message key
     * @param defaultMessage fallback default message
     */
    @Override
    public void reject(String errorCode, String defaultMessage) {

    }

    /**
     * Register a global error for the entire target object,
     * using the given error description.
     *
     * @param errorCode      error code, interpretable as a message key
     * @param errorArgs      error arguments, for argument binding via MessageFormat
     *                       (can be {@code null})
     * @param defaultMessage fallback default message
     */
    @Override
    public void reject(String errorCode, Object[] errorArgs, String defaultMessage) {

    }

    /**
     * Register a field error for the specified field of the current object
     * (respecting the current nested path, if any), using the given error
     * description.
     * <p>The field name may be {@code null} or empty String to indicate
     * the current object itself rather than a field of it. This may result
     * in a corresponding field error within the nested object graph or a
     * global error if the current object is the top object.
     *
     * @param field     the field name (may be {@code null} or empty String)
     * @param errorCode error code, interpretable as a message key
     * @see #getNestedPath()
     */
    @Override
    public void rejectValue(String field, String errorCode) {
        throw new BeanDefinitionValidationException(field+errorCode);
        //throw new RuntimeException(field+errorCode);
    }

    /**
     * Register a field error for the specified field of the current object
     * (respecting the current nested path, if any), using the given error
     * description.
     * <p>The field name may be {@code null} or empty String to indicate
     * the current object itself rather than a field of it. This may result
     * in a corresponding field error within the nested object graph or a
     * global error if the current object is the top object.
     *
     * @param field          the field name (may be {@code null} or empty String)
     * @param errorCode      error code, interpretable as a message key
     * @param defaultMessage fallback default message
     * @see #getNestedPath()
     */
    @Override
    public void rejectValue(String field, String errorCode, String defaultMessage) {

    }

    /**
     * Register a field error for the specified field of the current object
     * (respecting the current nested path, if any), using the given error
     * description.
     * <p>The field name may be {@code null} or empty String to indicate
     * the current object itself rather than a field of it. This may result
     * in a corresponding field error within the nested object graph or a
     * global error if the current object is the top object.
     *
     * @param field          the field name (may be {@code null} or empty String)
     * @param errorCode      error code, interpretable as a message key
     * @param errorArgs      error arguments, for argument binding via MessageFormat
     *                       (can be {@code null})
     * @param defaultMessage fallback default message
     * @see #getNestedPath()
     */
    @Override
    public void rejectValue(String field, String errorCode, Object[] errorArgs, String defaultMessage) {
        System.out.println("tst");
    }

    /**
     * Add all errors from the given {@code Errors} instance to this
     * {@code Errors} instance.
     * <p>This is a convenience method to avoid repeated {@code reject(..)}
     * calls for merging an {@code Errors} instance into another
     * {@code Errors} instance.
     * <p>Note that the passed-in {@code Errors} instance is supposed
     * to refer to the same target object, or at least contain compatible errors
     * that apply to the target object of this {@code Errors} instance.
     *
     * @param errors the {@code Errors} instance to merge in
     */
    @Override
    public void addAllErrors(Errors errors) {

    }

    /**
     * Return if there were any errors.
     */
    @Override
    public boolean hasErrors() {
        return false;
    }

    /**
     * Return the total number of errors.
     */
    @Override
    public int getErrorCount() {
        return 0;
    }

    /**
     * Get all errors, both global and field ones.
     *
     * @return a list of {@link ObjectError} instances
     */
    @Override
    public List<ObjectError> getAllErrors() {
        return null;
    }

    /**
     * Are there any global errors?
     *
     * @return {@code true} if there are any global errors
     * @see #hasFieldErrors()
     */
    @Override
    public boolean hasGlobalErrors() {
        return false;
    }

    /**
     * Return the number of global errors.
     *
     * @return the number of global errors
     * @see #getFieldErrorCount()
     */
    @Override
    public int getGlobalErrorCount() {
        return 0;
    }

    /**
     * Get all global errors.
     *
     * @return a list of {@link ObjectError} instances
     */
    @Override
    public List<ObjectError> getGlobalErrors() {
        return null;
    }

    /**
     * Get the <i>first</i> global error, if any.
     *
     * @return the global error, or {@code null}
     */
    @Override
    public ObjectError getGlobalError() {
        return null;
    }

    /**
     * Are there any field errors?
     *
     * @return {@code true} if there are any errors associated with a field
     * @see #hasGlobalErrors()
     */
    @Override
    public boolean hasFieldErrors() {
        return false;
    }

    /**
     * Return the number of errors associated with a field.
     *
     * @return the number of errors associated with a field
     * @see #getGlobalErrorCount()
     */
    @Override
    public int getFieldErrorCount() {
        return 0;
    }

    /**
     * Get all errors associated with a field.
     *
     * @return a List of {@link FieldError} instances
     */
    @Override
    public List<FieldError> getFieldErrors() {
        return null;
    }

    /**
     * Get the <i>first</i> error associated with a field, if any.
     *
     * @return the field-specific error, or {@code null}
     */
    @Override
    public FieldError getFieldError() {
        return null;
    }

    /**
     * Are there any errors associated with the given field?
     *
     * @param field the field name
     * @return {@code true} if there were any errors associated with the given field
     */
    @Override
    public boolean hasFieldErrors(String field) {
        return false;
    }

    /**
     * Return the number of errors associated with the given field.
     *
     * @param field the field name
     * @return the number of errors associated with the given field
     */
    @Override
    public int getFieldErrorCount(String field) {
        return 0;
    }

    /**
     * Get all errors associated with the given field.
     * <p>Implementations should support not only full field names like
     * "name" but also pattern matches like "na*" or "address.*".
     *
     * @param field the field name
     * @return a List of {@link FieldError} instances
     */
    @Override
    public List<FieldError> getFieldErrors(String field) {
        return null;
    }

    /**
     * Get the first error associated with the given field, if any.
     *
     * @param field the field name
     * @return the field-specific error, or {@code null}
     */
    @Override
    public FieldError getFieldError(String field) {
        return null;
    }

    /**
     * Return the current value of the given field, either the current
     * bean property value or a rejected update from the last binding.
     * <p>Allows for convenient access to user-specified field values,
     * even if there were type mismatches.
     *
     * @param field the field name
     * @return the current value of the given field
     */
    @Override
    public Object getFieldValue(String field) {
        return null;
    }

    /**
     * Return the type of a given field.
     * <p>Implementations should be able to determine the type even
     * when the field value is {@code null}, for example from some
     * associated descriptor.
     *
     * @param field the field name
     * @return the type of the field, or {@code null} if not determinable
     */
    @Override
    public Class<?> getFieldType(String field) {
        return null;
    }
}
